using System;
using System.Collections.Generic;

namespace FinalProject
{
    public class ConditionalStatement: conditionalstatementsBaseVisitor<string>
    {
        private readonly Dictionary<string, int> _assignmentDictionary = new();
        public override string VisitStart(conditionalstatementsParser.StartContext context)
        {
            return Visit(context.block());
        }

        public override string VisitBlock(conditionalstatementsParser.BlockContext context)
        {
            return Visit(context.statement(0));
        }

        public override string VisitAssignment(conditionalstatementsParser.AssignmentContext context)
        {
            var id = context.ID().GetText();
            var number = int.Parse(context.NUMBER().GetText());
            _assignmentDictionary.Add(id,number);
            return string.Empty;
        }
    }
}