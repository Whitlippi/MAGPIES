/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf(" no") >= 0 || statement.indexOf("no ") >= 0 || statement.lastIndexOf("no") == 0 || statement.indexOf("no") == 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("Ms. Kelly") >= 0)
		{
			response = "She sounds like a great teacher.";
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("pet") >= 0)
		{
			response = "Tell me more about your pets?";
		}
		else if (statement.indexOf("changed the IP") >= 0
				|| statement.indexOf("changed the I.P.") >= 0
				|| statement.indexOf("changed the ip") >= 0)
		{
			response = "It was Malcom! ;)";
		}
		else if (statement.indexOf("Based God") >= 0 || statement.indexOf("based god") >= 0)
		{
			response = "We are Based God";
		}
		else if (statement.indexOf("joke") >= 0 || statement.indexOf("Joke") >= 0)
		{
			response = "Ok. I'll tell you a joke. \n \n*************** \n \nWhat happened to the computer programmer who crossed the "
					+ "road? \nHe got hit by a bus! ha!";
		}
		else if (statement.trim().equals(""))
		{
			response = "Say something, please.";
		}
	/*	else if (statement.indexOf("+") >= 0)
		{
			double d1 = Double.parseDouble(statement.substring(statement.lastIndexOf(" ", statement.indexOf("+")-1))); 
			double d2 = Double.parseDouble(statement.substring(statement.indexOf(" ", statement.indexOf("+")-1)));
			double d3 = d1+d2;
			response = d1 +" " + "+" + d2 + " = " + d3;
		} */
		else if (statement.indexOf("know") >= 0 || statement.indexOf("Know") >= 0)
		{
			response = "My knowledge is limited...";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "How thoughtful.";
		}
		if (whichResponse == 5)
		{
			response = "really?";
		}
		if (whichResponse == 6)
		{
			response = "Ohh?";
		}
		return response;
	}
}
