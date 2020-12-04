using System;
					
public class Program
{
	public class MyPair<T, U> {
		public readonly T Fst;
		public readonly U Snd;

		public MyPair(T Fst, U Snd) {
			this.Fst = Fst;
			this.Snd = Snd;
		}

		public String toString() {
			return "(" + Fst + ", " + Snd + ")";
		}
	}
	
	public static void Main()
	{
		MyPair<String, int> pair = new MyPair<String, int>("Andres", 13);
		Console.WriteLine(pair.toString());
	}
}