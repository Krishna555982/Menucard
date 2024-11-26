import java.util.*;
class Hotel
{
	public static void main (String[] args)
	{
		System.out.println("1.Dosa \n 2.Idly \n 3.Vada \n 4.Puri \n 5.Bajji \n 6.Uthappa \n 7.Chapathi");
		Scanner sc= new Scanner(System.in);
		System.out.println("Entrt your tiffin number:- ");
		int t=sc.nextInt();
		switch(t)
		{
			case 1:
			{
				System.out.println("Dosa............30");
			}
				break;
			case 2:
			{
				System.out.println("Idly............30");
			}
			break;
			case 3:
			{
				System.out.println("Vada............30");
			}
			break ;
			case 4:
			{
				System.out.println("Puri............30");
			}
			break;
			case 5:
			{
				System.out.println("Bajji............30");
			}
			break;
			case 6:
			{
				System.out.println("Uthappa............30");
			}
			break;
			case 7:
			{
				System.out.println("Chapathi............30");
			}
			break;
			default :
			{
				System.out.println("Enter a vaild data");
			}
		}
	}
}