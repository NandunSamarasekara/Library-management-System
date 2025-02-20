import java.util.Scanner;

public class DisplayingBooks {
    
    public static void categories() {
        Scanner scanner = new Scanner(System.in);

        //Creating the categories of books
        String[] Bookcategories = {
            "1. Fiction",
            "2. Non-Fiction",
            "3. Science Fiction & Fantasy",
            "4. Mystery & Thriller",
            "5. Romance",
            "6. Biography & Autobiography",
            "7. Self-Help & Personal Development",
            "8. History",
            "9. Science & Technology",
            "10. Children's & Young Adult (YA)"
        };
        
        //Displayng the categories to the user
        for (String category : Bookcategories) {
            System.out.println(category);
        }        
        
        //Taking the input from the user
        System.out.print("Enter the option: ");
        int option2 = scanner.nextInt();
        System.out.println();
    
        switch (option2) {
            case 1:
                printFictionBooks();//To display the fiction books
                break;
            case 2:
                printNonFictionBooks();//To display the non fiction books
                break;
            case 3:
                printScienceAndFantasyBooks();//To display the science books
                break;
            case 4:
                printMysteryBooks();//To display mystery books
                break;
            case 5:
                printRomanceBooks();//To display romance books
                break;
            case 6:
                printBiographyBooks();//To display biography books
                break;
            case 7:
                printSelfHelpBooks();//To display selfhelp books
                break;
            case 8:
                printHistoryBooks();//To display history books
                break;
            case 9:
                printScienceTechBooks();//To display science and tech books
                break;
            case 10:
                printChildrenBooks();//To display children books
                break;
            default:
                System.out.println("Invalid option. Please select a number between 1 and 10.");
        }
    }


    //Need to include the mentioned books below into a database with their ISBNs

    
    // Methods to print books for each category
    
    public static void printFictionBooks() {
        String[] fictionBooks = getFictionBooks();
        System.out.println("Fiction Books:");
        System.out.println("--------------");
        for (int i = 0; i < fictionBooks.length; i++) {
            System.out.println((i + 1) + ". " + fictionBooks[i]);
        }
    }
    
    public static void printNonFictionBooks() {
        String[] nonFictionBooks = getNonFictionBooks();
        System.out.println("Non-Fiction Books:");
        System.out.println("--------------");
        for (int i = 0; i < nonFictionBooks.length; i++) {
            System.out.println((i + 1) + ". " + nonFictionBooks[i]);
        }
    }
    
    public static void printScienceAndFantasyBooks() {
        String[] books = getScienceAndFantasyBooks();
        System.out.println("Science Fiction & Fantasy Books:");
        System.out.println("--------------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    public static void printMysteryBooks() {
        String[] books = getMysteryBooks();
        System.out.println("Mystery & Thriller Books:");
        System.out.println("-------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    public static void printRomanceBooks() {
        String[] books = getRomanceBooks();
        System.out.println("Romance Books:");
        System.out.println("--------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    public static void printBiographyBooks() {
        String[] books = getBiographyBooks();
        System.out.println("Biography & Autobiography Books:");
        System.out.println("--------------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    public static void printSelfHelpBooks() {
        String[] books = getSelfHelpBooks();
        System.out.println("Self-Help & Personal Development Books:");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    public static void printHistoryBooks() {
        String[] books = getHistoryBooks();
        System.out.println("History Books:");
        System.out.println("--------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    public static void printScienceTechBooks() {
        String[] books = getScienceTechBooks();
        System.out.println("Science & Technology Books:");
        System.out.println("--------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    public static void printChildrenBooks() {
        String[] books = getChildrenBooks();
        System.out.println("Children's & Young Adult (YA) Books:");
        System.out.println("-----------------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    // Methods to return arrays for each category
    public static String[] getFictionBooks() {
        return new String[]{
            "The Great Gatsby - F. Scott Fitzgerald",
            "To Kill a Mockingbird - Harper Lee",
            "1984 - George Orwell",
            "Pride and Prejudice - Jane Austen",
            "The Catcher in the Rye - J.D. Salinger",
            "The Lord of the Rings - J.R.R. Tolkien",
            "One Hundred Years of Solitude - Gabriel García Márquez",
            "The Kite Runner - Khaled Hosseini",
            "The Alchemist - Paulo Coelho",
            "The Book Thief - Markus Zusak",
            "The Handmaid's Tale - Margaret Atwood",
            "The Road - Cormac McCarthy",
            "The Picture of Dorian Gray - Oscar Wilde",
            "Wuthering Heights - Emily Brontë",
            "Crime and Punishment - Fyodor Dostoevsky",
            "Anna Karenina - Leo Tolstoy",
            "The Brothers Karamazov - Fyodor Dostoevsky",
            "The Sun Also Rises - Ernest Hemingway",
            "The Old Man and the Sea - Ernest Hemingway",
            "The Bell Jar - Sylvia Plath",
            "The Secret History - Donna Tartt",
            "The Goldfinch - Donna Tartt",
            "The Night Circus - Erin Morgenstern",
            "The Shadow of the Wind - Carlos Ruiz Zafón",
            "The Name of the Wind - Patrick Rothfuss",
            "The Pillars of the Earth - Ken Follett",
            "The Help - Kathryn Stockett",
            "The Color Purple - Alice Walker",
            "Beloved - Toni Morrison",
            "The Grapes of Wrath - John Steinbeck",
            "East of Eden - John Steinbeck",
            "The Sound and the Fury - William Faulkner",
            "As I Lay Dying - William Faulkner",
            "The Heart is a Lonely Hunter - Carson McCullers",
            "The Unbearable Lightness of Being - Milan Kundera",
            "The Master and Margarita - Mikhail Bulgakov",
            "The Stranger - Albert Camus"
        };
    }
    
    public static String[] getNonFictionBooks() {
        return new String[]{
            "Sapiens - Yuval Noah Harari",
            "Becoming - Michelle Obama",
            "Educated - Tara Westover",
            "The Subtle Art of Not Giving a F*ck - Mark Manson",
            "Atomic Habits - James Clear",
            "The Power of Now - Eckhart Tolle",
            "Thinking, Fast and Slow - Daniel Kahneman",
            "Quiet - Susan Cain",
            "Outliers - Malcolm Gladwell",
            "Blink - Malcolm Gladwell",
            "The Tipping Point - Malcolm Gladwell",
            "Freakonomics - Steven D. Levitt",
            "The Immortal Life of Henrietta Lacks - Rebecca Skloot",
            "Bad Blood - John Carreyrou",
            "The Sixth Extinction - Elizabeth Kolbert",
            "The Gene - Siddhartha Mukherjee",
            "The Emperor of All Maladies - Siddhartha Mukherjee",
            "The Body - Bill Bryson",
            "A Short History of Nearly Everything - Bill Bryson",
            "The Wright Brothers - David McCullough",
            "1776 - David McCullough",
            "Team of Rivals - Doris Kearns Goodwin",
            "The Warmth of Other Suns - Isabel Wilkerson",
            "Caste - Isabel Wilkerson",
            "The New Jim Crow - Michelle Alexander",
            "Evicted - Matthew Desmond",
            "Between the World and Me - Ta-Nehisi Coates",
            "We Should All Be Feminists - Chimamanda Ngozi Adichie",
            "Dear Ijeawele - Chimamanda Ngozi Adichie",
            "The Art of War - Sun Tzu",
            "Meditations - Marcus Aurelius",
            "The Soul of a Woman - Isabel Allende"
        };
    }
    
    public static String[] getScienceAndFantasyBooks() {
        return new String[]{
            "Dune - Frank Herbert",
            "Harry Potter and the Sorcerer's Stone - J.K. Rowling",
            "The Hobbit - J.R.R. Tolkien",
            "The Lord of the Rings - J.R.R. Tolkien",
            "A Game of Thrones - George R.R. Martin",
            "The Name of the Wind - Patrick Rothfuss",
            "The Wise Man's Fear - Patrick Rothfuss",
            "Ender's Game - Orson Scott Card",
            "Neuromancer - William Gibson",
            "Snow Crash - Neal Stephenson",
            "The Martian - Andy Weir",
            "Ready Player One - Ernest Cline",
            "The Hunger Games - Suzanne Collins",
            "The Handmaid's Tale - Margaret Atwood",
            "Fahrenheit 451 - Ray Bradbury",
            "Brave New World - Aldous Huxley",
            "1984 - George Orwell",
            "The Left Hand of Darkness - Ursula K. Le Guin",
            "The Dispossessed - Ursula K. Le Guin",
            "The Road - Cormac McCarthy",
            "The Stand - Stephen King",
            "The Dark Tower Series - Stephen King",
            "American Gods - Neil Gaiman",
            "Neverwhere - Neil Gaiman",
            "Good Omens - Neil Gaiman & Terry Pratchett",
            "The Ocean at the End of the Lane - Neil Gaiman"
        };
    }
    
    public static String[] getMysteryBooks() {
        return new String[]{
            "The Girl with the Dragon Tattoo - Stieg Larsson",
            "Gone Girl - Gillian Flynn",
            "The Silent Patient - Alex Michaelides",
            "The Da Vinci Code - Dan Brown",
            "Angels & Demons - Dan Brown",
            "The Girl on the Train - Paula Hawkins",
            "Big Little Lies - Liane Moriarty",
            "The Reversal - Michael Connelly",
            "The Lincoln Lawyer - Michael Connelly",
            "The Black Echo - Michael Connelly",
            "The Poet - Michael Connelly",
            "The Night Fire - Michael Connelly",
            "The Drop - Michael Connelly",
            "The Burning Room - Michael Connelly",
            "The Crossing - Michael Connelly",
            "The Wrong Side of Goodbye - Michael Connelly",
            "Two Kinds of Truth - Michael Connelly",
            "Dark Sacred Night - Michael Connelly",
            "The Night Fire - Michael Connelly",
            "The Law of Innocence - Michael Connelly",
            "The Last Coyote - Michael Connelly",
            "Trunk Music - Michael Connelly",
            "The Concrete Blonde - Michael Connelly",
            "The Black Ice - Michael Connelly",
            "The Closers - Michael Connelly",
            "Echo Park - Michael Connelly",
            "The Overlook - Michael Connelly",
            "The Brass Verdict - Michael Connelly",
            "The Scarecrow - Michael Connelly",
            "The Fifth Witness - Michael Connelly"
        };
    }
    
    public static String[] getRomanceBooks() {
        return new String[]{
            "The Hating Game - Sally Thorne",
            "Beach Read - Emily Henry",
            "The Kiss Quotient - Helen Hoang",
            "Red, White & Royal Blue - Casey McQuiston",
            "It Ends with Us - Colleen Hoover",
            "The Love Hypothesis - Ali Hazelwood",
            "Me Before You - Jojo Moyes",
            "The Flatshare - Beth O’Leary",
            "One Day in December - Josie Silver",
            "The Unhoneymooners - Christina Lauren",
            "Pride and Prejudice - Jane Austen",
            "Outlander - Diana Gabaldon",
            "The Duke and I (Bridgerton Series) - Julia Quinn",
            "Devil in Winter - Lisa Kleypas",
            "Romancing Mister Bridgerton - Julia Quinn",
            "A Week to Be Wicked - Tessa Dare",
            "The Duchess Deal - Tessa Dare",
            "The Viscount Who Loved Me - Julia Quinn",
            "Secrets of a Summer Night - Lisa Kleypas",
            "The Bride - Julie Garwood",
            "A Court of Thorns and Roses - Sarah J. Maas",
            "From Blood and Ash - Jennifer L. Armentrout",
            "The Night Circus - Erin Morgenstern",
            "Radiance - Grace Draven",
            "Kushiel’s Dart - Jacqueline Carey",
            "The Winter King - C.L. Wilson",
            "Strange the Dreamer - Laini Taylor",
            "The Bridge Kingdom - Danielle L. Jensen",
            "A Heart of Blood and Ashes - Milla Vane",
            "The Bird and the Sword - Amy Harmon"
        };
    }
    
    public static String[] getBiographyBooks() {
        return new String[]{
            "Steve Jobs by Walter Isaacson",
            "Becoming by Michelle Obama",
            "Long Walk to Freedom by Nelson Mandela",
            "Team of Rivals: The Political Genius of Abraham Lincoln by Doris Kearns Goodwin",
            "The Diary of a Young Girl by Anne Frank",
            "Churchill: A Life by Martin Gilbert",
            "Alexander Hamilton by Ron Chernow",
            "Cleopatra: A Life by Stacy Schiff",
            "The Autobiography of Malcolm X by Malcolm X and Alex Haley",
            "John Adams by David McCullough",
            "Van Gogh: The Life by Steven Naifeh and Gregory White Smith",
            "Frida: A Biography of Frida Kahlo by Hayden Herrera",
            "Shakespeare: The World as Stage by Bill Bryson",
            "The Immortal Life of Henrietta Lacks by Rebecca Skloot",
            "Leonardo da Vinci by Walter Isaacson",
            "Agatha Christie: An Autobiography by Agatha Christie",
            "M Train by Patti Smith",
            "Just Kids by Patti Smith",
            "The Brontë Myth by Lucasta Miller",
            "The Letters of Vincent van Gogh by Vincent van Gogh",
            "Einstein: His Life and Universe by Walter Isaacson",
            "The Man Who Knew Infinity: A Life of the Genius Ramanujan by Robert Kanigel",
            "Madame Curie: A Biography by Eve Curie",
            "The Wright Brothers by David McCullough",
            "Alan Turing: The Enigma by Andrew Hodges",
            "The Double Helix: A Personal Account of the Discovery of the Structure of DNA by James D. Watson",
            "Nikola Tesla: A Biography by Carol Dommermuth-Costa",
            "The Invention of Nature: Alexander von Humboldt’s New World by Andrea Wulf",
            "Hidden Figures: The American Dream and the Untold Story of the Black Women Mathematicians Who Helped Win the Space Race by Margot Lee Shetterly",
            "Marie Antoinette: The Journey by Antonia Fraser"
        };
    }
    
    public static String[] getSelfHelpBooks() {
        return new String[]{
            "The Power of Now - Eckhart Tolle",
            "Atomic Habits - James Clear",
            "The 7 Habits of Highly Effective People - Stephen R. Covey",
            "How to Win Friends and Influence People - Dale Carnegie",
            "The Subtle Art of Not Giving a F*ck - Mark Manson",
            "You Are a Badass - Jen Sincero",
            "Think and Grow Rich - Napoleon Hill",
            "The Four Agreements - Don Miguel Ruiz",
            "The Gifts of Imperfection - Brené Brown",
            "Daring Greatly - Brené Brown",
            "Grit - Angela Duckworth",
            "The Power of Positive Thinking - Norman Vincent Peale",
            "Mindset: The New Psychology of Success - Carol S. Dweck",
            "Deep Work - Cal Newport",
            "The Miracle Morning - Hal Elrod",
            "The Compound Effect - Darren Hardy",
            "The 5 Second Rule - Mel Robbins",
            "Quiet: The Power of Introverts in a World That Can’t Stop Talking - Susan Cain",
            "The Art of Happiness - Dalai Lama and Howard Cutler",
            "Ego Is the Enemy - Ryan Holiday",
            "Rich Dad Poor Dad - Robert Kiyosaki",
            "The Chimp Paradox - Steve Peters",
            "The War of Art - Steven Pressfield",
            "Awaken the Giant Within - Tony Robbins",
            "The One Thing - Gary Keller & Jay Papasan",
            "The 10X Rule - Grant Cardone",
            "The Miracle Equation - Hal Elrod",
            "Drive: The Surprising Truth About What Motivates Us - Daniel H. Pink",
            "The Success Principles - Jack Canfield",
            "Big Magic: Creative Living Beyond Fear - Elizabeth Gilbert"
        };
    }
    
    public static String[] getHistoryBooks() {
        return new String[]{
            "Sapiens: A Brief History of Humankind - Yuval Noah Harari",
            "The History of the Ancient World - Susan Wise Bauer",
            "The Guns of August - Barbara Tuchman",
            "A People's History of the United States - Howard Zinn",
            "The Wright Brothers - David McCullough",
            "The Silk Roads: A New History of the World - Peter Frankopan",
            "The Diary of a Young Girl - Anne Frank",
            "The History of the Decline and Fall of the Roman Empire - Edward Gibbon",
            "The Cold War: A New History - John Lewis Gaddis",
            "The Battle Cry of Freedom - James M. McPherson",
            "1776 - David McCullough",
            "Team of Rivals: The Political Genius of Abraham Lincoln - Doris Kearns Goodwin",
            "The Origins of Political Order - Francis Fukuyama",
            "The Second World War - Winston Churchill",
            "The Rise and Fall of the Third Reich - William L. Shirer",
            "The Civil War: A Narrative - Shelby Foote",
            "The Black Book of Communism - Stéphane Courtois",
            "The Liberation Trilogy - Rick Atkinson",
            "The Emancipation of the French Revolution - Peter McPhee",
            "The American Revolution: A Constitutional Interpretation - Charles Howard McIlwain",
            "Gulag Archipelago - Aleksandr Solzhenitsyn",
            "The Origins of the Second World War - A.J.P. Taylor",
            "The Great War and Modern Memory - Paul Fussell",
            "The History of the Peloponnesian War - Thucydides",
            "The Romans: From Village to Empire - M. T. Boatwright, M. T. Foster, D. J. Gruber",
            "The Mediterranean and the Mediterranean World in the Age of Philip II - Fernand Braudel",
            "The History of the World in 12 Maps - Jerry Brotton",
            "The Making of the English Working Class - E.P. Thompson",
            "A Short History of Nearly Everything - Bill Bryson",
            "The Story of the British Isles in 100 Places - Neil Oliver"
        };
    }
    
    public static String[] getScienceTechBooks() {
        return new String[]{
            "A Brief History of Time - Stephen Hawking",
            "The Selfish Gene - Richard Dawkins",
            "The Gene: An Intimate History - Siddhartha Mukherjee",
            "The Innovators - Walter Isaacson",
            "The Structure of Scientific Revolutions - Thomas S. Kuhn",
            "The Double Helix - James D. Watson",
            "Astrophysics for People in a Hurry - Neil deGrasse Tyson",
            "Cosmos - Carl Sagan",
            "The Feynman Lectures on Physics - Richard P. Feynman",
            "The Man Who Knew Infinity - Robert Kanigel",
            "A Short History of Nearly Everything - Bill Bryson",
            "The Code Book - Simon Singh",
            "The Emperor of All Maladies - Siddhartha Mukherjee",
            "Superintelligence - Nick Bostrom",
            "The Intelligent Investor - Benjamin Graham",
            "The Singularity is Near - Ray Kurzweil",
            "How to Create a Mind - Ray Kurzweil",
            "The Second Machine Age - Erik Brynjolfsson & Andrew McAfee",
            "The Martian - Andy Weir",
            "The Big Picture - Sean Carroll",
            "The Quantum Universe - Brian Cox and Jeff Forshaw",
            "The Theory of Everything - Stephen Hawking",
            "The Drunkard's Walk - Leonard Mlodinow",
            "The Information - James Gleick",
            "The Universe in a Nutshell - Stephen Hawking",
            "The Physics of the Future - Michio Kaku",
            "The God Delusion - Richard Dawkins",
            "The Rise and Fall of the Dinosaurs - Steve Brusatte",
            "Homo Deus - Yuval Noah Harari",
            "Sapiens - Yuval Noah Harari"
        };
    }
    
    public static String[] getChildrenBooks() {
        return new String[]{
            "Harry Potter and the Sorcerer's Stone - J.K. Rowling",
            "The Hunger Games - Suzanne Collins",
            "Matilda - Roald Dahl",
            "Percy Jackson & the Olympians: The Lightning Thief - Rick Riordan",
            "Wonder - R.J. Palacio",
            "The Fault in Our Stars - John Green",
            "The Giver - Lois Lowry",
            "Anne of Green Gables - L.M. Montgomery",
            "Charlotte's Web - E.B. White",
            "Alice's Adventures in Wonderland - Lewis Carroll",
            "The Chronicles of Narnia - C.S. Lewis",
            "The Outsiders - S.E. Hinton",
            "The Maze Runner - James Dashner",
            "Diary of a Wimpy Kid - Jeff Kinney",
            "The Book Thief - Markus Zusak",
            "The Hobbit - J.R.R. Tolkien",
            "Bridge to Terabithia - Katherine Paterson",
            "Coraline - Neil Gaiman",
            "A Wrinkle in Time - Madeleine L'Engle",
            "The Secret Garden - Frances Hodgson Burnett",
            "The Princess Diaries - Meg Cabot",
            "Eleanor & Park - Rainbow Rowell",
            "The Perks of Being a Wallflower - Stephen Chbosky",
            "Divergent - Veronica Roth",
            "Looking for Alaska - John Green",
            "Holes - Louis Sachar",
            "Shiver - Maggie Stiefvater",
            "The Absolutely True Diary of a Part-Time Indian - Sherman Alexie",
            "Miss Peregrine's Home for Peculiar Children - Ransom Riggs",
            "Eragon - Christopher Paolini",
            "The City of Ember - Jeanne DuPrau",
            "The Knife of Never Letting Go - Patrick Ness"
        };
    }
    
    // Search functionality:
    // This method iterates over all book arrays. When a book title matches (ignoring case),
    // it prints the book’s title, author, and category.
    public static void searchBook(String bookName) {
        boolean found = false;
        if (searchInCategory(bookName, getFictionBooks(), "Fiction")) found = true;
        if (searchInCategory(bookName, getNonFictionBooks(), "Non-Fiction")) found = true;
        if (searchInCategory(bookName, getScienceAndFantasyBooks(), "Science Fiction & Fantasy")) found = true;
        if (searchInCategory(bookName, getMysteryBooks(), "Mystery & Thriller")) found = true;
        if (searchInCategory(bookName, getRomanceBooks(), "Romance")) found = true;
        if (searchInCategory(bookName, getBiographyBooks(), "Biography & Autobiography")) found = true;
        if (searchInCategory(bookName, getSelfHelpBooks(), "Self-Help & Personal Development")) found = true;
        if (searchInCategory(bookName, getHistoryBooks(), "History")) found = true;
        if (searchInCategory(bookName, getScienceTechBooks(), "Science & Technology")) found = true;
        if (searchInCategory(bookName, getChildrenBooks(), "Children's & Young Adult (YA)")) found = true;
        
        if (!found) {
            System.out.println("Book not found.");
        }
    }
    
    private static boolean searchInCategory(String bookName, String[] books, String category) {
        for (String entry : books) {
            // Assume entries are formatted as "Title - Author" or "Title by Author"
            String[] parts;
            if (entry.contains(" - ")) {
                parts = entry.split(" - ");
            } else if (entry.contains(" by ")) {
                parts = entry.split(" by ");
            } else {
                continue;
            }
            if (parts.length < 2)
                continue;
            String title = parts[0].trim();
            String author = parts[1].trim();
            if (title.equalsIgnoreCase(bookName.trim())) {
                System.out.println("Book: " + title);
                System.out.println("Author: " + author);
                System.out.println("Category: " + category);
                return true;
            }
        }
        return false;
    }
    

}

