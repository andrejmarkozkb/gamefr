package ClickerGame;

public class BuyUpgrades extends Fields {
    public static void mainUpgrades() {
        menuToggleMessages.set(false);
        UpgradeMenus.mainUpgradesMenu();
        currentInput = input.nextLine();
        which = currentInput;
        if (which.equals("click upgrades") || which.equals("Click upgrades") || which.equals("1")) {
            if (unlockedClickPowerUpgrades[0] < 1) {
                if (balance.get() >= mainUpgradeCosts[0] * 100) {
                    balance.set(balance.get() - mainUpgradeCosts[0] * 100);
                    Main.clickUpgrades("Unlock", -1, "");
                    mainUpgrades();
                } else {
                    Main.notEnoughMoney("CLICK UPGRADES", mainUpgradeCosts[0]);
                    mainUpgrades();
                }
            } else {
                clickUpgrades();
            }
        } else if (which.equals("generator") || which.equals("Generator") || which.equals("2")) {
            if (unlockedGeneratorProductionUpgrades[0] < 1) {
                if (balance.get() >= mainUpgradeCosts[1] * 100) {
                    balance.set(balance.get() - mainUpgradeCosts[1] * 100);
                    Generator.generatorUpgrades("Unlock", -1, "");
                    mainUpgrades();
                } else {
                    Main.notEnoughMoney("GENERATOR UPGRADES", mainUpgradeCosts[1]);
                    mainUpgrades();
                }

            } else {
                generatorUpgrades();
            }
        } else {
            which = "";
            menuToggleMessages.set(true);
            Main.displayMenu("StartMenu");
        }

    }

    public static void clickUpgrades() {
        UpgradeMenus.clickUpgradesMenu();
        currentInput = input.nextLine();
        which = currentInput;
        if (which.equals("1") || which.equals("Click Power") || which.equals("click power") || which.contains("power") || which.contains("Power")) {
            clickPowerUpgrades();
        } else {
            mainUpgrades();
        }

    }

    public static void clickPowerUpgrades() {
        UpgradeMenus.clickPowerUpgradesMenu();
        currentInput = input.nextLine();
        which = currentInput;
        if (which.equals("1") || which.equals("Click Novice") || which.equals("click novice") || which.contains("Novice") || which.contains("novice")) {
            if (unlockedClickPowerUpgrades[0] < 10) {
                if (balance.get() >= clickPowerUpgradeCosts[0] * 100) {
                    balance.set(balance.get() - clickPowerUpgradeCosts[0] * 100);
                    clickPowerUpgradeCosts[0] += 50L * unlockedClickPowerUpgrades[0];
                    Main.clickUpgrades("ClickPower", 0, "CLICK NOVICE");
                    clickPowerUpgrades();
                } else {
                    Main.notEnoughMoney("CLICK ROOKIE", clickPowerUpgradeCosts[0]);
                    clickPowerUpgrades();
                }
            } else {
                Main.alreadyMaxedOut("CLICK NOVICE");
                clickPowerUpgrades();
            }
        } else if (which.equals("2") || which.equals("Click Rookie") || which.equals("click rookie") || which.contains("Rookie") || which.contains("rookie")) {
            if (unlockedClickPowerUpgrades[1] < 10) {
                if (balance.get() >= clickPowerUpgradeCosts[1] * 100) {
                    balance.set(balance.get() - clickPowerUpgradeCosts[1] * 100);
                    clickPowerUpgradeCosts[1] *= 2;
                    Main.clickUpgrades("ClickPower", 1, "CLICK ROOKIE");
                    clickPowerUpgrades();
                } else {
                    Main.notEnoughMoney("CLICK ROOKIE", clickPowerUpgradeCosts[1]);
                    clickPowerUpgrades();
                }
            } else {
                Main.alreadyMaxedOut("CLICK ROOKIE");
                clickPowerUpgrades();
            }


        } else {
            clickUpgrades();
        }

    }

    public static void generatorUpgrades() {
        UpgradeMenus.generatorUpgradesMenu();
        currentInput = input.nextLine();
        which = currentInput;
        if (which.equals("1") || which.contains("Production") || which.contains("production")) {
            productionUpgrades();
        } else if (which.equals("2") || which.contains("Speed") || which.contains("speed") || which.contains("Efficiency") || which.contains("efficiency")) {
            efficiencyUpgrades();
        } else {
            mainUpgrades();
        }

    }

    public static void productionUpgrades() {
        UpgradeMenus.productionUpgradesMenu();
        currentInput = input.nextLine();
        which = currentInput;
        if (which.equals("1") || which.equals("Improved Production") || which.equals("improved production") || which.contains("improved") || which.contains("Improved")) {
            if (unlockedGeneratorProductionUpgrades[0] < 10) {
                if (balance.get() >= generatorProductionUpgradeCosts[0] * 100) {
                    balance.set(balance.get() - generatorProductionUpgradeCosts[0] * 100);
                    generatorProductionUpgradeCosts[0] += 100;
                    Generator.generatorUpgrades("Production", 0, "IMPROVED PRODUCTION");
                    productionUpgrades();
                } else {
                    Main.notEnoughMoney("IMPROVED PRODUCTION", generatorProductionUpgradeCosts[0]);
                    productionUpgrades();
                }
            } else {
                Main.alreadyMaxedOut("IMPROVED PRODUCTION");
                productionUpgrades();
            }
        } else {
            generatorUpgrades();
        }

    }
    public static void efficiencyUpgrades() {
        UpgradeMenus.efficiencyUpgradesMenu();
        currentInput = input.nextLine();
        which = currentInput;
        if (which.equals("1") || which.equals("Improved Efficiency") || which.equals("improved efficiency") || which.contains("improved") || which.contains("Improved")) {
            if (unlockedGeneratorEfficiencyUpgrades[0] < 10) {
                if (balance.get() >= generatorEfficiencyUpgradeCosts[0] * 100) {
                    balance.set(balance.get() - generatorEfficiencyUpgradeCosts[0] * 100);
                    generatorProductionUpgradeCosts[0] += 100;
                    Generator.generatorUpgrades("Efficiency", 0, "IMPROVED EFFICIENCY");
                    efficiencyUpgrades();
                } else {
                    Main.notEnoughMoney("IMPROVED EFFICIENCY", generatorEfficiencyUpgradeCosts[0]);
                    efficiencyUpgrades();
                }
            } else {
                Main.alreadyMaxedOut("IMPROVED EFFICIENCY");
                efficiencyUpgrades();
            }
        } else {
            generatorUpgrades();
        }

    }


}
//1	Novice
//2	Rookie
//4	Amateur
//5	Apprentice
//6	Experienced
//7	Trained
//8	Skilled
//9	Pro
//10	Expert
//11	Master
//12	Legend
//13	Grandmaster
//13	Godlike
//14	Celestial
//15	Divine
//16	Ascended
//Improves
//
//
//
//Enhances
//
//
//
//Reinforces
//
//
//
//Strengthens
//
//
//
//Refines
//
//
//
//Optimizes
//
//
//
//Upgrades
//
//
//
//Amplifies
//
//
//
//Augments
//
//
//
//Evolves
//
//
//
//Advances
//
//
//
//Transforms
//
//
//
//Perfects
//
//
//
//Overclocks
//
//
//
//Supercharges
//
//
//
//Revolutionizes
//
//
//
//Ascends
//
//
//
//Transcends
//
//
//
//Dominates
//
//
//
//Maximizes
