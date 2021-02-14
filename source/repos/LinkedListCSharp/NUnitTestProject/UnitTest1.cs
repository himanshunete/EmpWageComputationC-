using NUnit.Framework;
using LinkedListCSharp;

namespace NUnitTestProject
{

    public class Tests
    {
        MyNode myFirstNode;
        MyNode mySecondNode;
        MyNode myThirdNode;
        [SetUp]
        public void Setup()
        {
            myFirstNode = new MyNode(56);
            mySecondNode = new MyNode(30);
            myThirdNode = new MyNode(70);

        }

        [Test]
        public void Test1()
        {
            myFirstNode.setNext(mySecondNode);
            mySecondNode.setNext(myThirdNode);
            bool result = myFirstNode.getNext().Equals(mySecondNode) &&
                             mySecondNode.getNext().Equals(myThirdNode);
            Assert.True(result);
        }
    }
}