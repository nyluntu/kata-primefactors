using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;
using PrimeFactors;

namespace PrimeFactors.Tests
{
    [TestFixture]
    public class PrimeFactorsTest
    {

        [Test]
        public void TestPrimeFactors()
        {
            PrimeFactors primeFactors = new PrimeFactors();
            CollectionAssert.AreEqual(new List<int>(), primeFactors.GetPrimeFactors(0));
            CollectionAssert.AreEqual(new List<int>(), primeFactors.GetPrimeFactors(1));
            CollectionAssert.AreEqual(new List<int>() { 2 }, primeFactors.GetPrimeFactors(2));
            CollectionAssert.AreEqual(new List<int>() { 3 }, primeFactors.GetPrimeFactors(3));
            CollectionAssert.AreEqual(new List<int>() { 2, 2 }, primeFactors.GetPrimeFactors(4));
            CollectionAssert.AreEqual(new List<int>() { 5 }, primeFactors.GetPrimeFactors(5));
            CollectionAssert.AreEqual(new List<int>() { 2, 3 }, primeFactors.GetPrimeFactors(6));
            CollectionAssert.AreEqual(new List<int>() { 7 }, primeFactors.GetPrimeFactors(7));
            CollectionAssert.AreEqual(new List<int>() { 2, 2, 2 }, primeFactors.GetPrimeFactors(8));
            CollectionAssert.AreEqual(new List<int>() { 3, 3 }, primeFactors.GetPrimeFactors(9));
            CollectionAssert.AreEqual(new List<int>() { 2, 5 }, primeFactors.GetPrimeFactors(10));
            CollectionAssert.AreEqual(new List<int>() { 2, 3, 3, 3, 5, 7, 13 }, primeFactors.GetPrimeFactors(24570));
            CollectionAssert.AreEqual(new List<int>() { 2, 5, 7, 107, 127 }, primeFactors.GetPrimeFactors(951230));
        }
    }
}
