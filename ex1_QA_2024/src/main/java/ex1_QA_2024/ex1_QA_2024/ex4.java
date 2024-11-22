package ex1_QA_2024.ex1_QA_2024;

//Batel gofleyzer 211869409
//guy biton 207734724
public class ex4 {
	public static String Compare(double a, double b, String mod)

	{
	

		switch(mod) {

		  

		case "regular":

			  

		    if (a < b)

		    	return "B";

		    else

		    	return "A";

		

		  case "negatives":


			    if (-a < -b)

			    	return "B";

			    else

			    	return "A";

		   

		  

		  case "reciprocals":


			    if ((1/a) < (1/b))

			    	return "B";

			    else

			    	return "A"; 



		}

		return "mod do not exist";

		

	}
}
