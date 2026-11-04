public class CosmeticMenus extends Fields{
    public static void mainCosmeticsMenu() {
        formattedBalance = dollarFormatter.format((double) balance.get() / 100);
        System.out.printf("╔══════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║                     ░  ┏━┓┏━┓┏━┓┏┳┓┏━┓┏┳┓┳┏━┓┏━┓  ░                      ║\n");
        System.out.printf("║                     ░  ┃  ┃ ┃┗━┓┃┃┃┃┫  ┃ ┃┃  ┗━┓  ░                      ║\n");
        System.out.printf("║                     ░  %s┗━┛┗━┛┗━┛┻ ┻┗━┛ ┻ ┻┗━┛┗━┛%s  ░                    ║\n", UNDERLINED, RESET);
        System.out.printf("╠══════════════════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓  ║\n");
        System.out.printf("║  ┃                   THIS IS THE MAIN COSMETICS MENU                  ┃  ║\n");
        System.out.printf("║  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛  ║\n");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║                                                   ┏" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┓");
        System.out.printf("║    Your Current Balance:                          ┃   %s%-" + (formattedBalance.length() + 3) + "s%-" + (15 - formattedBalance.length()) + "s║\n", currency.get(), formattedBalance, "┃");
        System.out.printf("║                                                   ┗" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┛");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║    [1]  ❯ MAIN CLICK MESSAGE ❮                    ┌" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┐");
        System.out.printf("║           └─ Customize the main click message     │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
        System.out.printf("║              in various ways                      └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }
    public static void clickMessageMenu() {
        System.out.printf("╔══════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║      ░  ┏━┓┳  ┳┏━┓┳┏━  ┏┳┓┏━┓┏━┓┏━┓┏━┓┏━┓┏━┓  ┏━┓┏┳┓┳ ┳┳  ┳┏┓┏┏━┓  ░      ║\n");
        System.out.printf("║            ░  ┃  ┃  ┃┃  ┣┻┓  ┃┃┃┣┫ ┗━┓┗━┓┣━┫┃ ┳┣┫   ┗━┓ ┃ ┗┳┛┃  ┃┃┃┃┃ ┳  ░    ║\n");
        System.out.printf("║            ░  ┗━┛┻━┛┻┗━┛┻ ┻  ┻ ┻┗━┛┗━┛┗━┛┻ ┻┗━┛┗━┛  ┗━┛ ┻  ┻ ┻━┛┻┛┗┛┗━┛%s  ░   ║\n", UNDERLINED, RESET);
        System.out.printf("╠══════════════════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓  ║\n");
        System.out.printf("║  ┃                   THIS IS THE MAIN COSMETICS MENU                  ┃  ║\n");
        System.out.printf("║  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛  ║\n");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║                                                   ┏" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┓");
        System.out.printf("║    Your Current Balance:                          ┃   %s%-" + (formattedBalance.length() + 3) + "s%-" + (15 - formattedBalance.length()) + "s║\n", currency.get(), formattedBalance, "┃");
        System.out.printf("║                                                   ┗" + "━".repeat(formattedBalance.length() + 7) + "%-" + (15 - formattedBalance.length()) + "s║\n", "┛");
        System.out.printf("╠──────────────────────────────────────────────────────────────────────────╣\n");
        System.out.printf("║    [1]  ❯ MAIN CLICK MESSAGE ❮                    ┌" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┐");
        System.out.printf("║           └─ Customize the main click message     │   %-" + (unlockedText.length() + 3) + "s%-" + (16 - unlockedText.length()) + "s║\n", unlockedText, "│");
        System.out.printf("║              in various ways                      └" + "─".repeat(unlockedText.length() + 6) + "%-" + (16 - unlockedText.length()) + "s║\n", "┘");
        System.out.printf("╚══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("\nEnter the Number or Name of the upgrade to buy it, Press Anything else to go back...\n");
    }
}
