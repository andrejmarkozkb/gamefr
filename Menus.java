public class Menus extends Fields {
    public static int[] spacesLeft = new int[]{19, 19};
    public static int[] spacesRight = new int[]{17, 20};
    public static int[] lengthSave = new int[]{1, 1};
    public static String formattedClickPower = "";
    public static String formattedProduction = "";
    public static void mainUpgradesMenu() {
        formattedBalance = dollarFormatter.format(balance);
        System.out.printf("╔══════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║                      ░  ┳ ┳┏━┓┏━┓┳━┓┏━┓┏┳┓┏━┓┏━┓  ░                      ║\n");
        System.out.printf("║                      ░  ┃ ┃┣━┛┃ ┳┣┳┛┣━┫ ┃┃┃┫ ┗━┓  ░                      ║\n");
        System.out.printf("║                      ░  %s┗━┛┻  ┗━┛┻┗━┻ ┻━┻┛┗━┛┗━┛%s  ░                      ║\n", UNDERLINED, RESET);
        System.out.printf("╠══════════════════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓  ║\n");
        System.out.printf("║  ┃                   THIS IS THE MAIN UPGRADES MENU                   ┃  ║\n");
        System.out.printf("║  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛  ║\n");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║                                                   ┏" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┓");
        System.out.printf("║    Your Current Balance:                          ┃   %s%-" + (formattedBalance.length() + 3) + "s%-" + (15 - formattedBalance.length()) + "s║\n", currency.get(), formattedBalance, "┃");
        System.out.printf("║                                                   ┗" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┛");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        if (unlockedClickPowerUpgrades[0] < 1) {
            System.out.printf("║    [1]  ❯ CLICK UPGRADES ❮                        ┌" + "─".repeat(String.valueOf(mainUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(mainUpgradeCosts[0]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Unlocks the Click Upgrades menu,     │   %s%-" + (String.valueOf(mainUpgradeCosts[0]).length() + 3) + "d%-" + (15 - String.valueOf(mainUpgradeCosts[0]).length()) + "s║\n", currency.get(), mainUpgradeCosts[0], "│");
            System.out.printf("║              used to Upgrade you Click.           └" + "─".repeat(String.valueOf(mainUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(mainUpgradeCosts[0]).length()) + "s║\n", "┘");
        } else {
            System.out.printf("║    [1]  ❯ CLICK UPGRADES ❮                        ┌" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Select to view the                   │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
            System.out.printf("║              Click Upgrades menu...               └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        }
        System.out.printf("║                                                                          ║\n");
        if (unlockedGeneratorUpgrades[0] < 1) {
            System.out.printf("║    [2]  ❯ GENERATOR ❮                             ┌" + "─".repeat(String.valueOf(mainUpgradeCosts[1]).length() + 7) + "%-" + (15 - String.valueOf(mainUpgradeCosts[1]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Unlocks Passive income and menu,     │   %s%-" + (String.valueOf(mainUpgradeCosts[1]).length() + 3) + "d%-" + (15 - String.valueOf(mainUpgradeCosts[1]).length()) + "s║\n", currency.get(), mainUpgradeCosts[1], "│");
            System.out.printf("║              starting at %s%d per second.           └" + "─".repeat(String.valueOf(mainUpgradeCosts[1]).length() + 7) + "%-" + (15 - String.valueOf(mainUpgradeCosts[1]).length()) + "s║\n", currency.get(), generatorMoneyPerTick.get(), "┘");
        } else {
            System.out.printf("║    [2]  ❯ GENERATOR ❮                             ┌" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Select to check the                  │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
            System.out.printf("║              Generator Upgrades menu...           └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        }
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy/view it, Press Anything else to close the Menu...\n");

    }
    public static void clickUpgradesMenu() {
        formattedBalance = dollarFormatter.format(balance);
        System.out.printf("╔══════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║         ░  ┏━┓┳  ┳┏━┓┳┏━  ┳ ┳┏━┓┏━┓┳━┓┏━┓┏┳┓┏━┓  ┏━┓┳ ┳┏━┓┏━┓  ░         ║\n");
        System.out.printf("║         ░  ┃  ┃  ┃┃  ┣┻┓  ┃ ┃┣━┛┃ ┳┣┳┛┣━┫ ┃┃┃┫   ┗━┓┣━┫┃ ┃┣━┛  ░         ║\n");
        System.out.printf("║         ░  %s┗━┛┻━┛┻┗━┛┻ ┻  ┗━┛┻  ┗━┛┻┗━┻ ┻━┻┛┗━┛  ┗━┛┻ ┻┗━┛┻%s    ░         ║\n", UNDERLINED, RESET);
        System.out.printf("╠══════════════════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓  ║\n");
        System.out.printf("║  ┃                   THIS IS THE CLICK UPGRADES MENU                  ┃  ║\n");
        System.out.printf("║  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛  ║\n");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║                                                   ┏" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┓");
        System.out.printf("║    Your Current Balance:                          ┃   %s%-" + (formattedBalance.length() + 3) + "s%-" + (15 - formattedBalance.length()) + "s║\n", currency.get(), formattedBalance, "┃");
        System.out.printf("║                                                   ┗" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┛");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║    [1]  ❯ CLICK POWER ❮                           ┌" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┐");
        System.out.printf("║           └─ View Click Powers, used to           │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
        System.out.printf("║              used to upgrade money per click      └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }
    public static void clickPowerUpgradesMenu() {
        formattedBalance = dollarFormatter.format(balance);
        formattedClickPower = dollarFormatter.format(moneyPerClick);
        if (lengthSave[0] < formattedClickPower.length()) {
            lengthSave[0] = formattedClickPower.length() - lengthSave[0];
            if (lengthSave[0] == 2) {
                spacesRight[0]--;
                spacesLeft[0]--;
            } else {
                if (formattedClickPower.length() % 2 == 1) {
                    spacesLeft[0]--;
                } else {
                    spacesRight[0]--;
                }
            }
        }
        lengthSave[0] = formattedClickPower.length();
        System.out.printf("╔══════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║      ░  ┏━┓┳  ┳┏━┓┳┏━  ┏━┓┏━┓┳ ┳┏━┓┳━┓  ┳ ┳┏━┓┏━┓┳━┓┏━┓┏┳┓┏━┓┏━┓  ░      ║\n");
        System.out.printf("║      ░  ┃  ┃  ┃┃  ┣┻┓  ┣━┛┃ ┃┃┃┃┃┫ ┣┳┛  ┃ ┃┣━┛┃ ┳┣┳┛┣━┫ ┃┃┃┫ ┗━┓  ░      ║\n");
        System.out.printf("║      ░  %s┗━┛┻━┛┻┗━┛┻ ┻  ┻  ┗━┛┗┻┛┗━┛┻┗━  ┗━┛┻  ┗━┛┻┗━┻ ┻━┻┛┗━┛┗━┛%s  ░      ║\n", UNDERLINED, RESET);
        System.out.printf("╠══════════════════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓  ║\n");
        System.out.printf("║  %-" + (spacesLeft[0]) + "sTOTAL CLICK POWER: %s%-" + (formattedClickPower.length()) + "s %-" + (spacesRight[0] + 10) + "s┃  ║\n", "┃", "+" + currency.get(), formattedClickPower, "PER CLICK");
        System.out.printf("║  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛  ║\n");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║                                                   ╔" + "═".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "╗");
        System.out.printf("║    Your Current Balance:                          ║   %s%-" + (formattedBalance.length() + 3) + "s%-" + (15 - formattedBalance.length()) + "s║\n", currency.get(), formattedBalance, "║");
        System.out.printf("║                                                   ╚" + "═".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "╝");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        if (unlockedClickPowerUpgrades[0] < 10) {
            System.out.printf("║    [1]  ❯ CLICK NOVICE ❮                          ┌" + "─".repeat(String.valueOf(clickPowerUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(clickPowerUpgradeCosts[0]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Improves Money pet Click             │   %s%-" + (String.valueOf(clickPowerUpgradeCosts[0]).length() + 3) + "d%-" + (15 - String.valueOf(clickPowerUpgradeCosts[0]).length()) + "s║\n", currency.get(), clickPowerUpgradeCosts[0], "│");
            System.out.printf("║              %s%d -> %s%-" + (31 - String.valueOf(addToTotal[0] * unlockedClickPowerUpgrades[0]).length()) + "s└" + "─".repeat(String.valueOf(clickPowerUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(clickPowerUpgradeCosts[0]).length()) + "s║\n", currency, addToTotal[0] * unlockedClickPowerUpgrades[0], currency, addToTotal[0] + addToTotal[0] * unlockedClickPowerUpgrades[0], "┘");
        } else {
            System.out.printf("║    [1]  ❯ CLICK NOVICE ❮                          ┌" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Maxed! You earn                      │   %-" + (maxedText.length() + 3) + "s%-" + (16 - maxedText.length()) + "s║\n", maxedText, "│");
            System.out.printf("║              %s%d extra per click!                 └" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", currency.get(), addToTotal[0] * unlockedClickPowerUpgrades[0], "┘");
        }
        if (unlockedClickPowerUpgrades[1] < 10) {
            System.out.printf("║    [2]  ❯ CLICK ROOKIE ❮                          ┌" + "─".repeat(String.valueOf(clickPowerUpgradeCosts[1]).length() + 7) + "%-" + (15 - String.valueOf(clickPowerUpgradeCosts[1]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Upgrades Money pet Click             │   %s%-" + (String.valueOf(clickPowerUpgradeCosts[1]).length() + 3) + "d%-" + (15 - String.valueOf(clickPowerUpgradeCosts[1]).length()) + "s║\n", currency.get(), clickPowerUpgradeCosts[1], "│");
            System.out.printf("║              %s%d -> %s%-" + (31 - String.valueOf(addToTotal[1] * unlockedClickPowerUpgrades[1]).length()) + "s└" + "─".repeat(String.valueOf(clickPowerUpgradeCosts[1]).length() + 7) + "%-" + (15 - String.valueOf(clickPowerUpgradeCosts[1]).length()) + "s║\n", currency, addToTotal[1] * unlockedClickPowerUpgrades[1], currency, addToTotal[1] + addToTotal[1] * unlockedClickPowerUpgrades[1], "┘");
        } else {
            System.out.printf("║    [2]  ❯ CLICK ROOKIE ❮                          ┌" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Maxed! You earn                      │   %-" + (maxedText.length() + 3) + "s%-" + (16 - maxedText.length()) + "s║\n", maxedText, "│");
            System.out.printf("║              %s%d extra per click!                 └" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", currency.get(), addToTotal[1] * unlockedClickPowerUpgrades[1], "┘");
        }
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }
    public static void generatorUpgradesMenu() {
        formattedBalance = dollarFormatter.format(balance);
        formattedBalance = dollarFormatter.format(balance);
        System.out.printf("╔══════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║  ░  ┏━┓┏━┓┏┓┏┏━┓┳━┓┏━┓┏┳┓┏━┓┳━┓  ┳ ┳┏━┓┏━┓┳━┓┏━┓┏┳┓┏━┓  ┏━┓┳ ┳┏━┓┏━┓  ░  ║\n");
        System.out.printf("║  ░  ┃ ┳┃┫ ┃┃┃┃┫ ┣┳┛┣━┫ ┃ ┃ ┃┣┳┛  ┃ ┃┣━┛┃ ┳┣┳┛┣━┫ ┃┃┃┫   ┗━┓┣━┫┃ ┃┣━┛  ░  ║\n");
        System.out.printf("║  ░  %s┗━┛┗━┛┛┗┛┗━┛┻┗━┻ ┻ ┻ ┗━┛┻┗━  ┗━┛┻  ┗━┛┻┗━┻ ┻━┻┛┗━┛  ┗━┛┻ ┻┗━┛┻%s    ░  ║\n", UNDERLINED, RESET);
        System.out.printf("╠══════════════════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓  ║\n");
        System.out.printf("║  ┃                 THIS IS THE GENERATOR UPGRADES MENU                ┃  ║\n");
        System.out.printf("║  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛  ║\n");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║                                                   ┏" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┓");
        System.out.printf("║    Your Current Balance:                          ┃   %s%-" + (formattedBalance.length() + 3) + "s%-" + (15 - formattedBalance.length()) + "s║\n", currency.get(), formattedBalance, "┃");
        System.out.printf("║                                                   ┗" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┛");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║    [1]  ❯ PRODUCTION ❮                            ┌" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┐");
        System.out.printf("║           └─ View Production Imporvements,        │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
        System.out.printf("║              used to Upgrade money per tick       └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }
    public static void productionUpgradesMenu() {
        formattedBalance = dollarFormatter.format(balance);
        formattedProduction = dollarFormatter.format(generatorMoneyPerTick.get());
        if (lengthSave[1] < formattedProduction.length()) {
            lengthSave[1] = formattedProduction.length() - lengthSave[1];
            if (lengthSave[1] == 2) {
                spacesRight[1]--;
                spacesLeft[1]--;
            } else {
                if (formattedProduction.length() % 2 == 1) {
                    spacesLeft[1]--;
                } else {
                    spacesRight[1]--;
                }
            }
        }
        lengthSave[1] = formattedProduction.length();
        System.out.printf("╔══════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║       ░  ┏━┓┳━┓┏━┓┏┳┓┳ ┳┏━┓┏┳┓┳┏━┓┏┓┏  ┳ ┳┏━┓┏━┓┳━┓┏━┓┏┳┓┏━┓┏━┓  ░       ║\n");
        System.out.printf("║       ░  ┣━┛┣┳┛┃ ┃ ┃┃┃ ┃┃   ┃ ┃┃ ┃┃┃┃  ┃ ┃┣━┛┃ ┳┣┳┛┣━┫ ┃┃┃┫ ┗━┓  ░       ║\n");
        System.out.printf("║       ░  %s┻  ┻┗━┗━┛━┻┛┗━┛┗━┛ ┻ ┻┗━┛┛┗┛  ┗━┛┻  ┗━┛┻┗━┻ ┻━┻┛┗━┛┗━┛%s  ░       ║\n", UNDERLINED, RESET);
        System.out.printf("╠══════════════════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓  ║\n");
        System.out.printf("║  %-" + (spacesLeft[1]) + "sTOTAL PRODUCTION: %s%-" + (formattedProduction.length()) + "s %-" + (spacesRight[1] + 8) + "s┃  ║\n", "┃", "+" + currency.get(), formattedProduction, "PER TICK");
        System.out.printf("║  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛  ║\n");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║                                                   ┏" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┓");
        System.out.printf("║    Your Current Balance:                          ┃   %s%-" + (formattedBalance.length() + 3) + "s%-" + (15 - formattedBalance.length()) + "s║\n", currency.get(), formattedBalance, "┃");
        System.out.printf("║                                                   ┗" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┛");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        if (unlockedGeneratorUpgrades[0] < 10) {
            System.out.printf("║    [1]  ❯ IMPROVED PRODUCTION ❮                   ┌" + "─".repeat(String.valueOf(generatorUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(generatorUpgradeCosts[0]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Improves money per tick              │   %s%-" + (String.valueOf(generatorUpgradeCosts[0]).length() + 3) + "d%-" + (15 - String.valueOf(generatorUpgradeCosts[0]).length()) + "s║\n", currency.get(), generatorUpgradeCosts[0], "│");
            System.out.printf("║              %s%d -> %s%-" + (31 - String.valueOf(generatorAddToTotal[0].get() * unlockedGeneratorUpgrades[0]).length()) + "s└" + "─".repeat(String.valueOf(generatorUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(generatorUpgradeCosts[0]).length()) + "s║\n", currency, generatorAddToTotal[0].get() * unlockedGeneratorUpgrades[0], currency, generatorAddToTotal[0].get() + generatorAddToTotal[0].get() * unlockedGeneratorUpgrades[0], "┘");
        } else {
            System.out.printf("║    [1]  ❯ IMPROVED PRODUCTION ❮                   ┌" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Maxed! You earn                      │   %-" + (maxedText.length() + 3) + "s%-" + (16 - maxedText.length()) + "s║\n", maxedText, "│");
            System.out.printf("║              %s%d extra per tick!                  └" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", currency.get(), generatorAddToTotal[0].get() * unlockedGeneratorUpgrades[0], "┘");
        }
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }
}
