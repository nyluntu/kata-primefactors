using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrimeFactors
{
    public class PrimeFactors
    {
        public List<int> GetPrimeFactors(int number)
        {
            List<int> factors = new List<int>();

            for (int divider = 2; number > 1; divider++)
                for (; number % divider == 0; number = number / divider)
                    factors.Add(divider);

            return factors;
        }
    }
}
