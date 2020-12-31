import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Java project to practice with text files
 *
 * @author     Jake Jacobs-Smith (jacobjv@auburn.edu)
 * @version    2020-12-28
 *
 */
public class TextFilePracticeTest {

   /** Test case for the printText method. */
   @Test
   public void printTextTest() {
      String expected = "It's like a flag at half mast as frames click fast\n"
      		+ "Not a thing will last as past is past\n"
      		+ "Like stacks of thoughts that got played and worn\n"
      		+ "Used over and over till they were tired and torn\n"
      		+ "Like a broken clock that can't tell time\n"
      		+ "Like a thick ass book that's filled with wack rhymes\n"
      		+ "Like a scorching blaze that burned the sand\n"
      		+ "Like a band that planned and planned and planned\n"
      		+ "And flew down like a raven in the dark of night\n"
      		+ "And snatched up the worm helpless to fight\n"
      		+ "And brought it back to the nest singing microphone check\n"
      		+ "One two one two, this is just a test\n"
      		+ "One two one two, this is just a test\n"
      		+ "One two one two, this is just a test\n"
      		+ "It's like sand in one hand You can't hold for long\n"
      		+ "Like scheming on a plan that goes all wrong\n"
      		+ "It's like fudge and caramel they're not the same\n"
      		+ "And it's a shame all you talk is game\n"
      		+ "You act like a diamond waiting to be set\n"
      		+ "In a gold ring, as if, I bet\n"
      		+ "As time goes by in this give and take\n"
      		+ "As long as I learn I will make mistakes\n"
      		+ "Now, what do I want? What do I need?\n"
      		+ "Why do I want it? What's in it for me?\n"
      		+ "It's the imagery of technology\n"
      		+ "Is what you get is what you see\n"
      		+ "Don't worry your mind\n"
      		+ "When you give it your best\n"
      		+ "One two one two this is just a test\n"
      		+ "One two one two, this is just a test\n"
      		+ "One two one two, this is just a test";
      TextFilePractice test =  new TextFilePractice();
      assertEquals(expected, test.printText());
   }
//
//   /** Test case for the search method. */
//   @Test
//   public void testSearch2() {
//      int[] a = {2, 4, 6, 8, 10};
//      int target = 2;
//      int expected = 0;
//      int actual = LinearSearch1.search(a, target);
//      assertEquals(expected, actual);
//   }
//
//   /** Test case for the search method. */
//   @Test
//   public void testSearch3() {
//      int[] a = {2, 4, 6, 8, 10};
//      int target = 10;
//      int expected = 4;
//      int actual = LinearSearch1.search(a, target);
//      assertEquals(expected, actual);
//   }
//   
//   /** Test case for the search method. */
//   @Test
//   public void testSearch4() {
//      int[] a = {2, 4, 6, 8, 10};
//      int target = 7;
//      int expected = -1;
//      int actual = LinearSearch1.search(a, target);
//      assertEquals(expected, actual);
//   }

}

