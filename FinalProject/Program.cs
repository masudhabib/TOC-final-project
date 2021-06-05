using System;
using Antlr4.Runtime;

namespace FinalProject
{
    internal static class Program
    {
        private static void Main(string[] args)
        {

            var fileReader = new FileReader();
            var fileContent = fileReader.ReadFile();
            foreach (var item in fileContent)
            {
                var stream = CharStreams.fromString(item);
                var lexer = new calculatorLexer(stream);
                var tokens = new CommonTokenStream(lexer); // lexer gives tokens
                var parser = new calculatorParser(tokens); 
                var tree = parser.start(); // parser gives tree
                var calculator = new Calculate();
                var output = calculator.Visit(tree); // walk over that tree to evaluate expression
                Console.WriteLine($"{item} = {output}");
            }
        }
    }
}