import java.util.Scanner;
import java.util.ArrayList;

class ColouredOutput {
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String RESET = "\033[0m";

    public static void output(String colour, String text, Object... formatObjects) {
        System.out.print(colour + String.format(text, formatObjects) + RESET);
    }

    public static void outputln(String colour, String text, Object... formatObjects) {
        output(RESET, text, formatObjects);
        System.out.println();
    }

    public static void outputError(String text, Object... formatObjects) {
        outputln(RED, text, formatObjects);
    }

    public static void outputData(String text, Object... formatObjects) {
        outputln(BLUE, text, formatObjects);
    }

    public static void outputOption(String text, Object... formatObjects) {
        outputln(PURPLE, text, formatObjects);
    }

    public static void outputInfo(String text, Object... formatObjects) {
        outputln(GREEN, text, formatObjects);
    }
} 

public class temp {
    static String calling_plan;
    static String data_plan;
    static ArrayList<String> complaints = new ArrayList<>();
    static boolean sim_activated = false;
    static Scanner scanner = new Scanner(System.in);

    public static int getChoice(String prompt, String[] display_options) {
        ColouredOutput.outputInfo(prompt);
        while (true) {
            int list_item = 1;
            for (String option : display_options) {
                ColouredOutput.outputOption("%d. %s", list_item++, option);
            }

            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                ColouredOutput.outputError("Input a valid integer.");
                continue;
            }

            if (option > 0 && option <= display_options.length) {
                return option;
            } else {
                ColouredOutput.outputError("Invalid option selected. Please pick again.");
            }
        }
    }

    public static boolean simNotActivatedCheck() {
        if (!sim_activated) {
            ColouredOutput.outputError("Please activate your SIM card first.");
        }
        return !sim_activated;
    }

    public static void main(String[] args) {
        ColouredOutput.outputInfo("Welcome to our customer care!");
        String main_prompt = "Please choose an option:";
        String[] main_options = {
            "Check Balance",
            "Recharge Balance",
            "Buy Data plan",
            "Sim Activation",
            "Register Complaint",
            "View Complains",
            "Talk to a specialist",
            "Exit",
        };
        boolean stop_loop = false;

        while (true) {
            if (stop_loop) {break;}
            int choice = getChoice(main_prompt, main_options);
            switch (choice) {
                case 1:
                    if (simNotActivatedCheck()) {break;}
                    ColouredOutput.outputData("Calling plan: %s\nData plan: %s", calling_plan, data_plan);
                    break;
                case 2:
                    if (simNotActivatedCheck()) {break;}
                    String[] calling_plans = {
                        "100$ 30 days unlimited calls",
                        "200$ 75 days unlimited calls"
                    };
                    int plan = getChoice("Select a plan:", calling_plans);
                    calling_plan = calling_plans[plan - 1];
                    ColouredOutput.outputData("Plan activated.");
                    break;
                case 3:
                    if (simNotActivatedCheck()) {break;}
                    String[] data_plans = {
                        "50$ 30 days 1GB/day",
                        "100$ 30 days 1GB/day"
                    };
                    int selected_data_plan = getChoice("Select a plan:", data_plans);
                    data_plan = data_plans[selected_data_plan - 1];
                    ColouredOutput.outputData("Plan activated.");
                    break;
                case 4:
                    if (sim_activated) {
                        ColouredOutput.outputError("Your SIM card is already active.");
                    } else {
                        sim_activated = true;
                        ColouredOutput.outputData("Your SIM card has been activated.");
                    }
                    break;
                case 5:
                    ColouredOutput.outputInfo("We're sorry to hear you're facing issues. Please type your complaint: ");
                    String complaint = scanner.nextLine();
                    complaints.add(complaint);
                    ColouredOutput.outputData("We've recieved your complaint. Complaint no: #%d", complaints.size());
                    break;
                case 6:
                    if (complaints.size() == 0) {
                        ColouredOutput.outputError("You haven't raised any complaints.");
                        break;
                    }
                    ColouredOutput.outputInfo("Here are all the complaints you've made:");
                    for (int i = 0; i < complaints.size(); i++) {
                        ColouredOutput.outputData("%d. " + complaints.get(i), i + 1);
                    }
                    break;
                case 7:
                    ColouredOutput.outputData("A specialist has been contacted. We will get back to you in a few minutes!");
                    break;
                case 8:
                    ColouredOutput.outputInfo("Thank you for using our services.");
                    stop_loop = true;
                    break;
            }
        }
    }
}