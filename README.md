# gamefr
public class Colors {
    public static final String BOLD = "\033[1m";
    public static final String ITALIC = "\033[3m";
    public static final String UNDERLINED = "\033[4m";
    public static final String BOLD_UNDERLINED = "\033[21m";
    public static final String STRIKETHROUGH = "\033[9m";
    public static final String BOXED = "\033[51m";
    public static final String BLACK = "\033[30m";
    public static final String YELLOW = "\033[93m";
    public static final String PINK = "\033[95m";
    public static final String AQUA = "\033[96m";
    public static final String WHITE = "\033[97m";
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m";
    public static final String TAN = "\033[33m";
    public static final String BLUE = "\033[34m";
    public static final String PURPLE = "\033[35m";
    public static final String CYAN = "\033[36m";
    public static final String GREY = "\033[37m";
    public static final String DARK_GREY = "\033[90m";
    public static final String LIGHT_GREEN = "\033[92m";
    public static final String SATURATED_RED = "\033[91m";
    public static final String SATURATED_BLUE = "\033[94m";
    public static final String BLACK_BACKGROUND = "\033[40m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String TAN_BACKGROUND = "\033[43m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";
    public static final String CYAN_BACKGROUND = "\033[46m";
    public static final String GREY_BACKGROUND = "\033[47m";
    public static final String WHITE_BACKGROUND = "\033[7m";
    public static final String DARK_GREY_BACKGROUND = "\033[100m";

} import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class ClickerMain extends Colors {
    public static final AtomicLong balance = new AtomicLong(0);
    public static final AtomicLong passiveAdd = new AtomicLong(1);
    public static final AtomicBoolean passiveIncomePause = new AtomicBoolean(false);
    public static final AtomicBoolean passiveIncomeMessages = new AtomicBoolean(true);
    public static final AtomicReference<String> currency = new AtomicReference<>("$");
    public static long add = 1;
    public static String currentInput = "";
    public static int increasing = 1;
    public static long[] costs = new long[]{10, 100};
    public static Scanner input = new Scanner(System.in);
    public static String topDownMenuFormatter = "*********************************";
    public static String inBetween = "";
    public static boolean clickWhile = true;
    public static boolean passiveIncomeUnlocked = false;
    public static boolean clickUpgradesUnlocked = false;
    public static String currentMenu = "";

    public static void main(String[] args) {
        displayMenu("StartMenu");
        while (clickWhile) {
            click();
        }


    }

    public static void click() {
        currentInput = input.nextLine();
        if (currentInput.isEmpty()) {
            balance.addAndGet(add);
            System.out.printf("+ %d %s\n", add, currency);
        } else if (currentInput.equals("C") || currentInput.equals("c") || currentInput.equals("controls") || currentInput.equals("Controls")) {
            displayMenu("ControlsMenu");
        } else if (currentInput.equals("B") || currentInput.equals("b") || currentInput.equals("show") || currentInput.equals("Show") || currentInput.equals("balance") || currentInput.equals("Balance")) {
            displayMenu("BalanceMenu");
        } else if (currentInput.equals("U") || currentInput.equals("u") || currentInput.equals("Upgrades") || currentInput.equals("upgrades") || currentInput.equals("buy") || currentInput.equals("Buy")) {
            displayMenu("UpgradesMenu");
        } else if (currentInput.equals("end") || currentInput.equals("End") || currentInput.equals("stop") || currentInput.equals("Stop") || currentInput.equals("finish") || currentInput.equals("Finish")) {
            System.exit(0);
        } else if ((currentInput.equals("P") || currentInput.equals("p") || currentInput.equals("Passive") || currentInput.equals("passive")) && passiveIncomeUnlocked) {
            passiveIncomePause.set(!passiveIncomePause.get());
        } else if ((currentInput.equals("M") || currentInput.equals("m") || currentInput.equals("Messages") || currentInput.equals("messages")) && passiveIncomeUnlocked) {
            passiveIncomeMessages.set(!passiveIncomeMessages.get());
        } else if (currentInput.equals("D") || currentInput.equals("d") ) {
            balance.set(balance.get() + 100);
        }
    }

    public static void displayMenu(String which) {
        if (which.equals("BalanceMenu")) {
            System.out.printf("You have %d %s\n", balance.get(), currency.get());
        } else if (which.equals("ControlsMenu")) {
            System.out.printf("%s\n", topDownMenuFormatter);
            System.out.printf("==Controls==\n");
            System.out.printf("------------\n");
            System.out.printf("[ENTER] Get Money\n");
            System.out.printf("[C / Controls] Controls Menu\n");
            System.out.printf("[B / Show / Balance] Show Balance\n");
            System.out.printf("[U / Upgrades / Buy] Updrages Menu\n");
            if (passiveIncomeUnlocked) {
                System.out.printf("[P / Passive] Toggle Passive Income\n");
                System.out.printf("[M / Messages] Toggle Passive Income Messages\n");
            }
            System.out.printf("[End / Stop / Finish] End Game\n");
            System.out.printf("%s\n", topDownMenuFormatter);

        } else if (which.equals("UpgradesMenu")) {
            System.out.printf("%s\n", topDownMenuFormatter);
            System.out.printf("==Upgrades==\n");
            System.out.printf("------------\n");
            if (!clickUpgradesUnlocked) {
                System.out.printf("[Click Upgrades / 1] **Unlock Click Upgrades** Upgrades your clicks in various ways. | Cost %d %s \n", costs[0], currency.get());
            } else {
                System.out.printf("[Click Upgrades / 1] View Click Upgrades...\n");
            }
            if (!passiveIncomeUnlocked) {
                System.out.printf("[Passive Income / 2] **Unlock Passive Income** Gives you passive money, starting at 1 %s per second. | Cost: %d %s\n", currency.get(), costs[1], currency.get());
            } else {
                System.out.printf("[Passive Income / 2] View Passive Income Upgrades...\n");
            }
            System.out.printf("%s\n", topDownMenuFormatter);
            System.out.printf("Enter the Number or Name of the upgrade to buy/view it, Press Anything else to close the Menu...\n");
            currentInput = input.nextLine();
            currentMenu = "Upgrades";
            upgrade(currentInput);


        } else if (which.equals("PassiveIncomeUpgradesMenu")) {
            System.out.printf("%s\n", topDownMenuFormatter);
            System.out.printf("==Passive Income Upgrades==\n");
            System.out.printf("------------------\n");
            System.out.printf("[1 / Money Per Tick] **Money Per Tick** Increases Money per Tick %d -> %d | Cost: %d %s\n", passiveAdd.get(), passiveAdd.get() + increasing, costs[1], currency.get());
            System.out.printf("%s\n", topDownMenuFormatter);
            System.out.printf("Enter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
            currentInput = input.nextLine();
            currentMenu = "Passive Income Upgrades";
            upgrade(currentInput);
        } else if (which.equals("ClickUpgradesMenu")) {
            System.out.printf("%s\n", topDownMenuFormatter);
            System.out.printf("==Click Upgrades==\n");
            System.out.printf("------------------\n");
            System.out.printf("[1 / Click Power] **Click Power** Increases Money per Click %d -> %d | Cost: %d %s\n", add, add + increasing, costs[0], currency.get());
            System.out.printf("%s\n", topDownMenuFormatter);
            System.out.printf("Enter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
            currentInput = input.nextLine();
            currentMenu = "Click Upgrades";
            upgrade(currentInput);
        } else if (which.equals("StartMenu")) {
            System.out.printf("=======================================\n");
            System.out.printf("=====||Java Console Clicker Game||=====\n");
            System.out.printf("====||Type 'ENTER' to earn money!||====\n");
            System.out.printf("=====||Type 'c' to see Controls!||=====\n");
            System.out.printf("=======================================\n");
        }

    }

    public static void upgrade(String which) {
        if ((which.equals("click upgrades") || which.equals("Click upgrades") || which.equals("1")) && currentMenu.equals("Upgrades")) {
            if (!clickUpgradesUnlocked) {
                if (balance.get() >= costs[0]) {
                    clickUpgrades("Unlock");
                } else {
                    System.out.printf("\033[1m\033[31m\nYou dont have enough money to buy **%s**! Cost: %d $ | Balance: %d $\033[0m\n\n","Click Upgrades", costs[0], balance.get());
                    displayMenu("UpgradesMenu");
                }
            } else {
                displayMenu("ClickUpgradesMenu");
            }
        } else if (which.equals("Passive Income") || which.equals("passive income") || which.equals("2")) {
            if (balance.get() >= costs[1]) {
                if (!passiveIncomeUnlocked) {
                    passiveIncome("Unlock");
                }
            } else {
                System.out.printf("\033[1m\033[31m\nYou dont have enough money to buy **%s**! Cost: %d $ | Balance: %d $\033[0m\n\n","Passive Income Upgrades", costs[1], balance.get());
            }
        } else if ((which.equals("1") || which.equals("Click Power") || which.equals("click power")) && currentMenu.equals("Click Upgrades")) {
            if (balance.get() >= costs[0]) {
                clickUpgrades("ClickPower");
            } else {
                System.out.printf("\033[1m\033[31m\nYou dont have enough money to buy **%s**! Cost: %d $ | Balance: %d $\033[0m\n\n","Click Power", costs[1], balance.get());
            }
        } else if ((which.equals("1") || which.equals("Money Per Tick") || which.equals("money per tick")) && currentMenu.equals("Passive Income Upgrades")) {
            if (balance.get() >= costs[0]) {
                clickUpgrades("MoneyPerTick");
            } else {
                System.out.printf("\033[1m\033[31m\nYou dont have enough money to buy **%s**! Cost: %d $ | Balance: %d $\033[0m\n\n","Click Power", costs[1], balance.get());
            }
        } else if (currentMenu.equals("Click Upgrades") || currentMenu.equals("Passive Income Upgrades")) {
            displayMenu("UpgradesMenu");
        } else if (currentMenu.equals("Upgrades")) {
            displayMenu("StartMenu");
        }
    }

    public static void clickUpgrades(String what) {
        if (what.equals("Unlock")) {
            clickUpgradesUnlocked = true;
            balance.set(balance.get() - costs[0]);
            costs[0] = 20;
            System.out.printf("You unlocked **Click Upgrades**!\n");
        } else if (what.equals("ClickPower")) {
            inBetween = String.valueOf(add);
            add += increasing;
            balance.set(balance.get() - costs[0]);
            costs[0] *= 3;
            System.out.printf("Your **Click Power** was upgraded! %s -> %d!\n", inBetween, add);
        }
    }

    public static void passiveIncome(String what) {
        if (what.equals("Unlock")) {
            passiveIncomeUnlocked = true;
            balance.set(balance.get() - costs[1]);
            costs[1] = 500;
            System.out.printf("You unlocked **Passive Income**!\n");
            ScheduledExecutorService passiveIncomeScheduler = Executors.newScheduledThreadPool(1);
            Runnable passiveIncomeTasks = () -> {
                if (!passiveIncomePause.get()) {
                    long passiveIncome = passiveAdd.get();
                    if (passiveIncome > 0) {
                        balance.addAndGet(passiveIncome);
                        if (passiveIncomeMessages.get()) {
                            System.out.printf("[Passive Income] + %d %s\n", passiveAdd.get(), currency.get());
                        }
                    }
                }
            };
            passiveIncomeScheduler.scheduleAtFixedRate(passiveIncomeTasks, 0, 2, TimeUnit.SECONDS);
        } else if (what.equals("MoneyPerTick")) {
            passiveAdd.set(passiveAdd.get() + 1);
            inBetween = String.valueOf(passiveAdd);
            passiveAdd.set(passiveAdd.get() + 1);
            balance.set(balance.get() - costs[1]);
            costs[1] *= 2;
            System.out.printf("Your **Money Per Tick** was upgraded! %s -> %d!\n", inBetween, passiveAdd.get());
        }
    }

}
