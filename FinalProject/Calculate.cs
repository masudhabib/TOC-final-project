using System;

namespace FinalProject
{
    public class Calculate: calculatorBaseVisitor<float>
    {
        public override float VisitStart(calculatorParser.StartContext context)
        {
            return Visit(context.expression());
        }

        public override float VisitAddSubtract(calculatorParser.AddSubtractContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            var result = Convert.ToSingle(0);
            var op = context.addsuboperator.Text;

            result = op switch
            {
                "+" => left + right,
                "-" => left - right,
                _ => result
            };

            return result;
        }

        public override float VisitMulDivideMod(calculatorParser.MulDivideModContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));
            var result = Convert.ToSingle(0);
            var op = context.multdivmodoperator.Text;
            result = op switch
            {
                "*" => left * right,
                "/" => left / right,
                "%" => left % right,
                _ => result
            };
            return result;
        }
        
        public override float VisitSquareRoot(calculatorParser.SquareRootContext context)
        {
            var number = Visit(context.expression());
            return Convert.ToSingle(Math.Sqrt(number));
        }
        
        public override float VisitSquare(calculatorParser.SquareContext context)
        {
            var number = Visit(context.expression());
            var result = number * number;
            return Convert.ToSingle(result);
        }

        public override float VisitLog(calculatorParser.LogContext context)
        {
            var number = Visit(context.expression());
            return Convert.ToSingle(Math.Log10(number));
        }
        
        public override float VisitTrigFunctions(calculatorParser.TrigFunctionsContext context)
        {
            var number = Visit(context.expression());
            number = Convert.ToSingle(number * (Math.PI / 180.0)); // convert degress to radians
            var op = context.trigOperators.Text;

            var result = Convert.ToSingle(0);
            result = op switch
            {
                "sin" => Convert.ToSingle(Math.Sin(number)),
                "cos" => Convert.ToSingle(Math.Cos(number)),
                "tan" => Convert.ToSingle(Math.Tan(number)),
                "cot" => Convert.ToSingle(1/Math.Tan(number)),
                _ => result
            };
            return result;
        }
        
        public override float VisitParentheses(calculatorParser.ParenthesesContext context)
        {
            return Visit(context.expression());
        }
        public override float VisitNumber(calculatorParser.NumberContext context)
        {
            var number = float.Parse(context.GetText());
            return number;
        }
    }
}