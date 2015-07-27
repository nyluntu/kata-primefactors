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

            if (number > 1)
                factors.Add(number);

            return factors;
        }
    }
}
