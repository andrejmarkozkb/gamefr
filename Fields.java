package ClickerGame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.text.NumberFormat;
import java.util.Locale;

public class Fields extends Formats{
    public static final AtomicReference<String> currency = new AtomicReference<>("$");
    public static long moneyPerClick = 100;
    public static final AtomicLong balance = new AtomicLong();
    public static final AtomicLong generatorMoneyPerTick = new AtomicLong(100);
    public static final AtomicBoolean generatorMessages = new AtomicBoolean(true);
    public static final AtomicLong generatorPeriod = new AtomicLong(10000);
    public static final AtomicLong[] generatorPeriodAddToTotal = new AtomicLong[]{new AtomicLong(20), new AtomicLong(50)};
    public static final AtomicBoolean menuToggleMessages = new AtomicBoolean(true);
    public static final AtomicLong[] generatorAddToTotal = new AtomicLong[]{new AtomicLong(100), new AtomicLong(200)};
    public static long[] unlockedGeneratorProductionUpgrades = new long[]{0, 0};
    public static long[] unlockedGeneratorEfficiencyUpgrades = new long[]{0, 0};
    public static ScheduledExecutorService generatorScheduler = Executors.newScheduledThreadPool(1);
    public static ScheduledFuture<?> toggleGenerator;
    public static boolean generatorToggled = false;
    public static long[] addToTotal = new long[]{100, 200, 500};
    public static int[] unlockedClickPowerUpgrades = new int[]{0, 0};
    public static int maxUpgrades = 10;
    public static String currentInput = "";
    public static Scanner input = new Scanner(System.in);
    public static String inBetween = "";
    public static boolean clickWhile = true;
    public static ArrayList<String> unlockedFonts = new ArrayList<>();
    public static String which = "";
    public static String mainPrefix = "[Clicked!] + ";
    public static String selectedFonts = "";
    public static String selectedColor = COLORLESS;
    public static String[] selectedColorScheme = FIRE;
    public static boolean fancyMessages = false;
    public static final NumberFormat dollarFormatter = NumberFormat.getInstance(Locale.US);
    public static final String unlockedText = "◈ VIEW ◈";
    public static final String maxedText = "◈ MAXED ◈";
    public static String colorType = "Multi";
    public static String formattedBalance = "";
    public static String topDownMenuFormatter = "=======================================";
    public static double doubleInBetween = 0;
    public static double comboMultiplier = 1.15;

}
