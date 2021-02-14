using System;
using System.Collections.Generic;
using System.Text;

namespace LinkedListCSharp
{
    public class MyNode
    {
		private int key;
		private MyNode next;

		public MyNode(int key)
		{
			this.key = key;
			this.next = null;
		}

        public MyNode()
        {
        }

        public int getKey()
		{
			return key;
		}

		
	    public void setKey(int key)
		{
			this.key = key;
		}
		public MyNode getNext()
		{
			return next;
		}

		public void setNext(MyNode next)
		{
			this.next = (MyNode)next;
		}
	}
}
