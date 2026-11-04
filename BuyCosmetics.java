package ClickerGame;

public class BuyCosmetics extends Fields {
    public static long[] fontCosts = new long[]{70, 100, 200, 500};
    public static void mainCosmetics() {
        menuToggleMessages.set(false);
        System.out.printf("%s\n", topDownMenuFormatter);
        System.out.printf("==Cosmetics==\n");
        System.out.printf("-------------\n");
        System.out.printf("[1 / Click Message Prefixes] Change how the main Click Message looks | Current: " + mainPrefix, moneyPerClick, currency, balance.get(), currency);
        System.out.printf("%s\n", topDownMenuFormatter);
        System.out.printf("Enter the Number or Name of the Cosmetic to view the list, Press Anything else to close the Menu...\n");
        currentInput = input.nextLine();
        which = currentInput;
        if (which.equals("1") || which.equals("Click") || which.equals("click") || which.contains("main") || which.contains("Main")) {
            clickPrefix();
        } else {
            menuToggleMessages.set(true);
            which = "";
            Main.displayMenu("StartMenu");
        }

    }

    public static void clickPrefix() {
        System.out.printf("%s\n", topDownMenuFormatter);
        System.out.printf("==Click Message Styling==\n");
        System.out.printf("-------------\n");
        System.out.printf("[1 / Font] Change how the font looks | Current: %sPREVIEW%s\n", selectedFonts, RESET);
        System.out.printf("%s\n", topDownMenuFormatter);
        System.out.printf("Enter the Number or Name of the Cosmetic to view the list, Press Anything else to close the Menu...\n");
        currentInput = input.nextLine();
        which = currentInput;
        if (which.equals("1") || which.equals("font") || which.equals("Font")) {
            clickMessageFonts();
        } else {
            mainCosmetics();
        }
    }

    public static void clickMessageFonts() {
        System.out.printf("%s\n", topDownMenuFormatter);
        System.out.printf("==Font Menu==\n");
        System.out.printf("-------------\n");
        if (!unlockedFonts.contains("Bold")) {
            System.out.printf("[1 / Bold] Buy %sBold%s | Cost: %d %s\n", BOLD, RESET, fontCosts[0], currency);
        } else {
            if (!selectedFonts.contains(BOLD)) {
                System.out.printf("[1 / Bold] Equip %sBold%s\n", BOLD, RESET);
            } else {
                System.out.printf("[1 / Bold] Unequip %sBold%s\n", BOLD, RESET);
            }
        }
        if (!unlockedFonts.contains("Italic")) {
            System.out.printf("[2 / Italic] Buy %sItalic%s | Cost: %d %s\n", ITALIC, RESET, fontCosts[1], currency);
        } else {
            if (!selectedFonts.contains(ITALIC)) {
                System.out.printf("[2 / Italic] Equip %sItalic%s\n", ITALIC, RESET);
            } else {
                System.out.printf("[2 / Italic] Unequip %sItalic%s\n", ITALIC, RESET);
            }
        }
        if (!unlockedFonts.contains("Underlined")) {
            System.out.printf("[3 / Underlined] Buy %sUnderlined%s | Cost: %d %s\n", UNDERLINED, RESET, fontCosts[2], currency);
        } else {
            if (!selectedFonts.contains(UNDERLINED)) {
                System.out.printf("[3 / Underlined] Equip %sUnderlined%s\n", UNDERLINED, RESET);
            } else {
                System.out.printf("[3 / Underlined] Unequip %sUnderlined%s\n", UNDERLINED, RESET);
            }
        }
        if (!unlockedFonts.contains("Strikethrough")) {
            System.out.printf("[4 / Strikethrough] Buy %sStrikethrough%s | Cost: %d %s\n", STRIKETHROUGH, RESET, fontCosts[3], currency);
        } else {
            if (!selectedFonts.contains(STRIKETHROUGH)) {
                System.out.printf("[4 / Strikethrough] Equip %sStrikethrough%s\n", STRIKETHROUGH, RESET);
            } else {
                System.out.printf("[4 / Strikethrough] Unequip %sStrikethrough%s\n", STRIKETHROUGH, RESET);
            }
        }
        System.out.printf("%s\n", topDownMenuFormatter);
        System.out.printf("Enter the Number or Name of the Font to buy / equip, Press Anything else to go back...\n");
        currentInput = input.nextLine();
        which = currentInput;
        if (which.equals("1") || which.equals("bold") || which.equals("Bold")) {
            if (!unlockedFonts.contains("Bold")) {
                if (balance.get() >= fontCosts[0]) {
                    balance.set(balance.get() - fontCosts[0]);
                    unlockedFonts.add("Bold");
                } else {
                    Main.notEnoughMoney(BOLD + "Bold", fontCosts[0]);
                    clickMessageFonts();
                    return;
                }
            } else {
                if (!selectedFonts.contains(BOLD)) {
                    selectedFonts = BOLD + selectedFonts;
                } else {
                    selectedFonts = selectedFonts.replace(BOLD, "");
                }
            }
            clickMessageFonts();
        } else if (which.equals("2") || which.equals("italic") || which.equals("Italic")) {
            if (!unlockedFonts.contains("Italic")) {
                if (balance.get() >= fontCosts[1]) {
                    balance.set(balance.get() - fontCosts[1]);
                    unlockedFonts.add("Italic");
                } else {
                    Main.notEnoughMoney(ITALIC + "Italic", fontCosts[1]);
                    clickMessageFonts();
                    return;
                }
            } else {
                if (!selectedFonts.contains(ITALIC)) {
                    selectedFonts = ITALIC + selectedFonts;
                } else {
                    selectedFonts = selectedFonts.replace(ITALIC, "");
                }
            }
            clickMessageFonts();
        } else if (which.equals("3") || which.equals("underlined") || which.equals("Underlined") || which.equals("line") || which.equals("Line")) {
            if (!unlockedFonts.contains("Underlined")) {
                if (balance.get() >= fontCosts[2]) {
                    balance.set(balance.get() - fontCosts[2]);
                    unlockedFonts.add("Underlined");
                } else {
                    Main.notEnoughMoney(UNDERLINED + "Underlined", fontCosts[2]);
                    clickMessageFonts();
                    return;
                }
            } else {
                if (!selectedFonts.contains(UNDERLINED)) {
                    selectedFonts = UNDERLINED + selectedFonts;
                } else {
                    selectedFonts = selectedFonts.replace(UNDERLINED, "");
                }
            }
            clickMessageFonts();
        } else if (which.equals("4") || which.equals("strikethrough") || which.equals("Strikethrough") || which.equals("strike") || which.equals("Strike")) {
            if (!unlockedFonts.contains("Strikethrough")) {
                if (balance.get() >= fontCosts[3]) {
                    balance.set(balance.get() - fontCosts[3]);
                    unlockedFonts.add("Strikethrough");
                } else {
                    Main.notEnoughMoney(STRIKETHROUGH + "Strikethrough", fontCosts[3]);
                    clickMessageFonts();
                    return;
                }
            } else {
                if (!selectedFonts.contains(STRIKETHROUGH)) {
                    selectedFonts = STRIKETHROUGH + selectedFonts;
                } else {
                    selectedFonts = selectedFonts.replace(STRIKETHROUGH, "");
                }
            }
            clickMessageFonts();
        } else {
            clickPrefix();
        }

    }
}
