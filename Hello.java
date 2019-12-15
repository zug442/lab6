public class Hello
{
	public static void main(String args[])
	{
		//Default "World"
		//Author DM(stetsenkodmitriy71@gmail.com)
		String name = "World";
		if (args.length != 0)
		{
			name = args[0];
		}
		System.out.println("Hello " + name + "!");
	}
}
