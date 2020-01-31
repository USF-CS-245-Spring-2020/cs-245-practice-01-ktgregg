public class Practice01MathIterative implements Practice01Math
{
	public int fib (int n) throws Exception
	{
		if (n < 0)
		{
			throw new Exception();
		}
		else if (n <= 1)
		{
			return n;
		}
		else {
			int fib = 1;
			int previous = 1;

			for (int i = 2; i < n; i++)
			{
				int temp = fib;
				fib += previous;
				previous = temp;
			}
			return fib;
		}
	}

	public int fact (int n) throws Exception
	{
		if (n < 0)
		{
			throw new Exception();
		}
		int fact = 1;
		for (int i = n; i > 0; i--)
		{
			fact *= i;
		}
		return fact;
	}
}
