import java.util.concurrent.TimeUnit;

public class Generator extends Fields {

    public static Runnable generatorTasks = () -> {
            long generatorIncome = generatorMoneyPerTick.get();
            if (generatorIncome > 0) {
                balance.addAndGet(generatorIncome);
                if (generatorMessages.get() && menuToggleMessages.get()) {
                    System.out.printf("[Generator] + %s%d\n", currency.get(), generatorMoneyPerTick.get());
                }
            }

    };
    public static void passiveIncomeUpgrades(String what, int howMuch, String displayMessage) {
        if (what.equals("Unlock")) {
            generatorResume();
            unlockedGeneratorUpgrades[0] = 1;
            System.out.printf("You unlocked **Generator**!\n");
        } else if (what.equals("Production")) {
            inBetween = String.valueOf(generatorAddToTotal[howMuch].get() * unlockedGeneratorUpgrades[0]);
            generatorMoneyPerTick.set(generatorMoneyPerTick.get() + generatorAddToTotal[howMuch].get());
            unlockedGeneratorUpgrades[0]++;
            System.out.printf("Your **%s%s%s** was upgraded! %s%s%s -> %s%d!%s\n", BOLD, displayMessage, RESET,  BOLD, inBetween, RESET, BOLD, generatorAddToTotal[howMuch].get() * unlockedGeneratorUpgrades[howMuch], RESET);
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
