import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class UnitedStatesStates
{
	public static String[] readWebsite(String website)
	{

		String state = null;

		// ArrayList<String> allStatesInTheUnitedStates = new
		// ArrayList<String>();

		String[] allStatesInTheUnitedStates = new String[55];
		allStatesInTheUnitedStates[0] = "Please select a state";

		Scanner scanner = null;

		try
		{

			URL url = new URL(website);

			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext())
			{
				for (int index = 0; index < allStatesInTheUnitedStates.length; index++)
				{
					state = sc.nextLine();
					int indexOfFirstQuote = state.indexOf("\"", 0);
					int indexOfSecondQuote = state.indexOf(",", 0);
					state = state.substring(indexOfFirstQuote,
							indexOfSecondQuote);
					state = state.replace("\"", "");
					allStatesInTheUnitedStates[index+1] = state;

				}

				// COULD USE AN ARRAY LIST BUT ITS NOT DYNAMICALLY SIZED?
				// state = sc.nextLine();
				// int indexOfFirstQuote = state.indexOf("\"", 0);
				// int indexOfSecondQuote = state.indexOf(",", 0);
				// state = state.substring(indexOfFirstQuote,
				// indexOfSecondQuote);
				// allStatesInTheUnitedStates.add(state);

			}
		}
		catch (Exception e)
		{

		}
		return allStatesInTheUnitedStates;
	}
}
