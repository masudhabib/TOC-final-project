using System;
using System.Collections.Generic;
using System.IO;

namespace FinalProject
{
    public class FileReader
    {
        public IEnumerable<string> ReadFile()
        {
            var directoryInfo = Directory.GetParent(Directory.GetCurrentDirectory());
            if (directoryInfo is null)
            {
                throw new FileNotFoundException();
            }
            var filePath = Path.Combine(directoryInfo.FullName, "input.txt"); 
            var inputList = new List<string>();

                try
                {
                    using var streamReader = new StreamReader(filePath);
                    string currentLine; // current line getting read from file
                    while ((currentLine = streamReader.ReadLine()) != null)
                    {
                        inputList.Add(currentLine);
                    }

                    return inputList;
                }
                catch (IOException e)
                {
                    Console.WriteLine("Error in Reading File");
                    throw;
                }
            
        }
    }
}