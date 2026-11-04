package ClickerGame;

import java.util.concurrent.TimeUnit;

public class Generator extends Fields {

    public static Runnable generatorTasks = () -> {
        long generatorIncome = generatorMoneyPerTick.get();
        if (generatorIncome > 0) {
            balance.addAndGet(generatorIncome);
            if (generatorMessages.get() && menuToggleMessages.get()) {
                System.out.printf("[Generator] + %s%d\n", currency.get(), (int) generatorMoneyPerTick.get() / 100);
            }
        }

    };
    public static void generatorUpgrades(String what, int howMuch, String displayMessage) {
        if (what.equals("Unlock")) {
            generatorResume();
            unlockedGeneratorProductionUpgrades[0] = 1;
            System.out.printf("You unlocked **Generator**!\n");
        } else if (what.equals("Production")) {
            inBetween = generatorAddToTotal[howMuch].get() * unlockedGeneratorProductionUpgrades[howMuch] / 100;
            generatorMoneyPerTick.set(generatorMoneyPerTick.get() + generatorAddToTotal[howMuch].get());
            unlockedGeneratorProductionUpgrades[howMuch]++;
            System.out.printf("Your **%s%s%s** was upgraded! %s%s%d%s -> %s%s%d!%s\n", BOLD, displayMessage, RESET,  BOLD, currency.get(), inBetween, RESET, BOLD, currency.get(), generatorAddToTotal[howMuch].get() * unlockedGeneratorProductionUpgrades[howMuch] / 100, RESET);
        } else if (what.equals("Efficiency")) {
            inBetween = generatorPeriodAddToTotal[howMuch].get() * unlockedGeneratorEfficiencyUpgrades[howMuch];
            generatorInterrupt();
            generatorPeriod.set(generatorPeriod.get() - generatorPeriodAddToTotal[howMuch].get());
            generatorResume();
            unlockedGeneratorEfficiencyUpgrades[howMuch]++;
            System.out.printf("Your **%s%s%s** was upgraded! %s%s%s%s -> %s%s%s!%s\n", BOLD, displayMessage, RESET,  BOLD, inBetween, "ms", RESET, BOLD, generatorPeriodAddToTotal[howMuch].get() * unlockedGeneratorEfficiencyUpgrades[howMuch], "ms", RESET);
        }
    }


    public static void generatorResume() {
        toggleGenerator = generatorScheduler.scheduleAtFixedRate(generatorTasks, generatorPeriod.get(), generatorPeriod.get(), TimeUnit.MILLISECONDS);
        generatorToggled = true;
    }
    public static void generatorInterrupt() {
        if (toggleGenerator != null) {
            toggleGenerator.cancel(false);
            generatorToggled = false;
        }
    }
}
