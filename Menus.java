package ClickerGame;

import java.util.concurrent.atomic.AtomicLong;

public class Menus extends Fields {
    public static int[] spacesLeft = new int[]{19, 19, 11};
    public static int[] spacesRight = new int[]{17, 20, 12};
    public static int[] lengthSave = new int[]{1, 1, 8};
    public static String formattedClickPower = "";
    public static String formattedProduction = "";
    public static double formattedGeneratorPeriod = 0;
    public static long[] displayGeneratorProductionUpgradeCosts = new long[]{500, 1000};
    public static long[] displayGeneratorEfficiencyUpgradeCosts = new long[]{1000, 500};
    public static long[] displayMaxUpgradeCosts = new long[]{10, 100};
    public static long[] displayClickPowerUpgradeCosts = new long[]{10, 100};
    public static long[] displayAddToTotal = new long[]{1, 2, 5};
    public static final AtomicLong[] diasplayGeneratorAddToTotal = new AtomicLong[]{new AtomicLong(1), new AtomicLong(2)};
    public static void mainUpgradesMenu() {
        formattedBalance = dollarFormatter.format((int) balance.get() / 100);
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
            System.out.printf("║    [1]  ❯ CLICK UPGRADES ❮                        ┌" + "─".repeat(String.valueOf(displayMaxUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(displayMaxUpgradeCosts[0]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Unlocks the Click Upgrades menu,     │   %s%-" + (String.valueOf(displayMaxUpgradeCosts[0]).length() + 3) + "d%-" + (15 - String.valueOf(displayMaxUpgradeCosts[0]).length()) + "s║\n", currency.get(), displayMaxUpgradeCosts[0], "│");
            System.out.printf("║              used to Upgrade you Click.           └" + "─".repeat(String.valueOf(displayMaxUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(displayMaxUpgradeCosts[0]).length()) + "s║\n", "┘");
        } else {
            System.out.printf("║    [1]  ❯ CLICK UPGRADES ❮                        ┌" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Select to view the                   │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
            System.out.printf("║              Click Upgrades menu...               └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        }
        System.out.printf("║                                                                          ║\n");
        if (unlockedGeneratorProductionUpgrades[0] < 1) {
            System.out.printf("║    [2]  ❯ GENERATOR ❮                             ┌" + "─".repeat(String.valueOf(displayMaxUpgradeCosts[1]).length() + 7) + "%-" + (15 - String.valueOf(displayMaxUpgradeCosts[1]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Unlocks Passive income and menu,     │   %s%-" + (String.valueOf(displayMaxUpgradeCosts[1]).length() + 3) + "d%-" + (15 - String.valueOf(displayMaxUpgradeCosts[1]).length()) + "s║\n", currency.get(), displayMaxUpgradeCosts[1], "│");
            System.out.printf("║              starting at %s%d per second.           └" + "─".repeat(String.valueOf(displayMaxUpgradeCosts[1]).length() + 7) + "%-" + (15 - String.valueOf(displayMaxUpgradeCosts[1]).length()) + "s║\n", currency.get(), generatorMoneyPerTick.get() / 100, "┘");
        } else {
            System.out.printf("║    [2]  ❯ GENERATOR ❮                             ┌" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Select to check the                  │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
            System.out.printf("║              Generator Upgrades menu...           └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        }
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy/view it, Press Anything else to close the Menu...\n");

    }
    public static void clickUpgradesMenu() {
        formattedBalance = dollarFormatter.format((int) balance.get() / 100);
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
        formattedBalance = dollarFormatter.format((int) balance.get() / 100);
        formattedClickPower = dollarFormatter.format((int) moneyPerClick / 100);
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
            System.out.printf("║    [1]  ❯ CLICK NOVICE ❮                          ┌" + "─".repeat(String.valueOf(displayClickPowerUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(displayClickPowerUpgradeCosts[0]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Improves Money pet Click             │   %s%-" + (String.valueOf(displayClickPowerUpgradeCosts[0]).length() + 3) + "s%-" + (15 - String.valueOf(displayClickPowerUpgradeCosts[0]).length()) + "s║\n", currency.get(), displayClickPowerUpgradeCosts[0], "│");
            System.out.printf("║              %s%d -> %s%-" + (33 - String.valueOf(displayAddToTotal[0] * unlockedClickPowerUpgrades[0]).length()) + "d└" + "─".repeat(String.valueOf(displayClickPowerUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(displayClickPowerUpgradeCosts[0]).length()) + "s║\n", currency, displayAddToTotal[0] * unlockedClickPowerUpgrades[0], currency, displayAddToTotal[0] + displayAddToTotal[0] * unlockedClickPowerUpgrades[0], "┘");
        } else {
            System.out.printf("║    [1]  ❯ CLICK NOVICE ❮                          ┌" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Maxed! You earn                      │   %-" + (maxedText.length() + 3) + "s%-" + (16 - maxedText.length()) + "s║\n", maxedText, "│");
            System.out.printf("║              %s%d extra per click!                 └" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", currency.get(), displayAddToTotal[0] * unlockedClickPowerUpgrades[0], "┘");
        }
        System.out.printf("║                                                                          ║\n");
        if (unlockedClickPowerUpgrades[1] < 10) {
            System.out.printf("║    [2]  ❯ CLICK ROOKIE ❮                          ┌" + "─".repeat(String.valueOf(displayClickPowerUpgradeCosts[1]).length() + 7) + "%-" + (15 - String.valueOf(displayClickPowerUpgradeCosts[1]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Upgrades Money pet Click             │   %s%-" + (String.valueOf(displayClickPowerUpgradeCosts[1]).length() + 3) + "d%-" + (15 - String.valueOf(displayClickPowerUpgradeCosts[1]).length()) + "s║\n", currency.get(), displayClickPowerUpgradeCosts[1], "│");
            System.out.printf("║              %s%d -> %s%-" + (33 - String.valueOf(displayAddToTotal[1] * unlockedClickPowerUpgrades[1]).length()) + "d└" + "─".repeat(String.valueOf(displayClickPowerUpgradeCosts[1]).length() + 7) + "%-" + (15 - String.valueOf(displayClickPowerUpgradeCosts[1]).length()) + "s║\n", currency, displayAddToTotal[1] * unlockedClickPowerUpgrades[1], currency, displayAddToTotal[1] + displayAddToTotal[1] * unlockedClickPowerUpgrades[1], "┘");
        } else {
            System.out.printf("║    [2]  ❯ CLICK ROOKIE ❮                          ┌" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Maxed! You earn                      │   %-" + (maxedText.length() + 3) + "s%-" + (16 - maxedText.length()) + "s║\n", maxedText, "│");
            System.out.printf("║              %s%d extra per click!                 └" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", currency.get(), displayAddToTotal[1] * unlockedClickPowerUpgrades[1], "┘");
        }
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }
    public static void generatorUpgradesMenu() {
        formattedBalance = dollarFormatter.format((int) balance.get() / 100);
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
        System.out.printf("║           └─ View Production Improvements,        │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
        System.out.printf("║              used to Upgrade money per tick       └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        System.out.printf("║                                                                          ║\n");
        System.out.printf("║    [2]  ❯ EFFICIENCY ❮                            ┌" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┐");
        System.out.printf("║           └─ View Efficiency Improvements,        │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
        System.out.printf("║              used to Upgrade the speed            └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }
    public static void productionUpgradesMenu() {
        formattedBalance = dollarFormatter.format((int) balance.get() / 100);
        formattedProduction = dollarFormatter.format((int) generatorMoneyPerTick.get() / 100);
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
        if (unlockedGeneratorProductionUpgrades[0] < 10) {
            System.out.printf("║    [1]  ❯ IMPROVED PRODUCTION ❮                   ┌" + "─".repeat(String.valueOf(displayGeneratorProductionUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(displayGeneratorProductionUpgradeCosts[0]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Improves money per tick              │   %s%-" + (String.valueOf(displayGeneratorProductionUpgradeCosts[0]).length() + 3) + "d%-" + (15 - String.valueOf(displayGeneratorProductionUpgradeCosts[0]).length()) + "s║\n", currency.get(), displayGeneratorProductionUpgradeCosts[0], "│");
            System.out.printf("║              %s%d -> %s%-" + (31 - String.valueOf(diasplayGeneratorAddToTotal[0].get() * unlockedGeneratorProductionUpgrades[0]).length()) + "s└" + "─".repeat(String.valueOf(displayGeneratorProductionUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(displayGeneratorProductionUpgradeCosts[0]).length()) + "s║\n", currency.get(), diasplayGeneratorAddToTotal[0].get() * unlockedGeneratorProductionUpgrades[0], currency.get(), diasplayGeneratorAddToTotal[0].get() + diasplayGeneratorAddToTotal[0].get() * unlockedGeneratorProductionUpgrades[0], "┘");
        } else {
            System.out.printf("║    [1]  ❯ IMPROVED PRODUCTION ❮                   ┌" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Maxed! You earn                      │   %-" + (maxedText.length() + 3) + "s%-" + (16 - maxedText.length()) + "s║\n", maxedText, "│");
            System.out.printf("║              %s%d extra per tick!                  └" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", currency.get(), diasplayGeneratorAddToTotal[0].get() * unlockedGeneratorProductionUpgrades[0], "┘");
        }
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }
    public static void efficiencyUpgradesMenu() {
        formattedBalance = dollarFormatter.format((int) balance.get() / 100);
        formattedGeneratorPeriod = (double) Math.round(((float) generatorPeriod.get() / 1000) * 100) / 100;
        if (formattedGeneratorPeriod < 10) {
            spacesLeft[2] = 12;
        }
        System.out.printf("╔══════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║        ░  ┏━┓┏━┓┏━┓┳┏━┓┳┏━┓┏┓┏┏━┓┳ ┳  ┳ ┳┏━┓┏━┓┳━┓┏━┓┏┳┓┏━┓┏━┓  ░        ║\n");
        System.out.printf("║        ░  ┃┫ ┣┫ ┣┫ ┃┃  ┃┃┫ ┃┃┃┃  ┗┳┛  ┃ ┃┣━┛┃ ┳┣┳┛┣━┫ ┃┃┃┫ ┗━┓  ░        ║\n");
        System.out.printf("║        ░  %s┗━┛┗  ┗  ┻┗━┛┻┗━┛┛┗┛┗━┛ ┻   ┗━┛┻  ┗━┛┻┗━┻ ┻━┻┛┗━┛┗━┛%s  ░        ║\n", UNDERLINED, RESET);
        System.out.printf("╠══════════════════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓  ║\n");
        System.out.printf("║  %-" + (spacesLeft[2]) + "sYOU CURRENCLY PRODUCE MONEY EVERY %-" + (String.valueOf(formattedGeneratorPeriod).length()) + ".2f %-" + (spacesRight[2] + 6) + "s┃  ║\n", "┃", formattedGeneratorPeriod, "SECONDS");
        System.out.printf("║  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛  ║\n");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║                                                   ┏" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┓");
        System.out.printf("║    Your Current Balance:                          ┃   %s%-" + (formattedBalance.length() + 3) + "s%-" + (15 - formattedBalance.length()) + "s║\n", currency.get(), formattedBalance, "┃");
        System.out.printf("║                                                   ┗" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┛");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        if (unlockedGeneratorEfficiencyUpgrades[0] < 10) {
            System.out.printf("║    [1]  ❯ IMPROVED EFFICIENCY ❮                   ┌" + "─".repeat(String.valueOf(displayGeneratorEfficiencyUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(displayGeneratorEfficiencyUpgradeCosts[0]).length()) + "s║\n", "┐");
            System.out.printf("║           └─ Increases Production speed by        │   %s%-" + (String.valueOf(displayGeneratorEfficiencyUpgradeCosts[0]).length() + 3) + "d%-" + (15 - String.valueOf(displayGeneratorEfficiencyUpgradeCosts[0]).length()) + "s║\n", currency.get(), displayGeneratorEfficiencyUpgradeCosts[0], "│");
            System.out.printf("║              %d%s -> %d%-" + (31 - String.valueOf(generatorPeriodAddToTotal[0].get() + generatorPeriodAddToTotal[0].get() * unlockedGeneratorEfficiencyUpgrades[0]).length() -  String.valueOf(generatorPeriodAddToTotal[0].get() * unlockedGeneratorEfficiencyUpgrades[0]).length()) + "s└" + "─".repeat(String.valueOf(displayGeneratorEfficiencyUpgradeCosts[0]).length() + 7) + "%-" + (15 - String.valueOf(displayGeneratorEfficiencyUpgradeCosts[0]).length()) + "s║\n", generatorPeriodAddToTotal[0].get() * unlockedGeneratorEfficiencyUpgrades[0], "ms", generatorPeriodAddToTotal[0].get() + generatorPeriodAddToTotal[0].get() * unlockedGeneratorEfficiencyUpgrades[0], "ms", "┘");
        } else {
            System.out.printf("║    [1]  ❯ IMPROVED EFFICIENCY ❮                   ┌" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", "┐");
            System.out.printf("║           └─ Maxed! Your Production speed         │   %-" + (maxedText.length() + 3) + "s%-" + (16 - maxedText.length()) + "s║\n", maxedText, "│");
            System.out.printf("║              is increased by %d%s!              └" + "─".repeat(maxedText.length() + 6) + "%-" + (16 - maxedText.length()) + "s║\n", generatorPeriodAddToTotal[0].get() * unlockedGeneratorEfficiencyUpgrades[0], "ms", "┘");
        }
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }

}
