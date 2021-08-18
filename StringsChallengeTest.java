
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StringsChallengeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StringsChallengeTest
{
    /**
     * Default constructor for test class StringsChallengeTest
     */
    public StringsChallengeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void withoutEndTest() {
        assertEquals("ell", StringsChallenge.withoutEnd("Hello"));
        assertEquals("av", StringsChallenge.withoutEnd("java"));
        assertEquals("odin", StringsChallenge.withoutEnd("coding"));
        assertEquals("od", StringsChallenge.withoutEnd("code"));
        assertEquals("", StringsChallenge.withoutEnd("ab"));
        assertEquals("hocolate", StringsChallenge.withoutEnd("Chocolate!"));
        assertEquals("itte", StringsChallenge.withoutEnd("kitten"));
        assertEquals("ooho", StringsChallenge.withoutEnd("woohoo"));
    }

    @Test
    public void frontAgainTest() {
        assertEquals(true, StringsChallenge.frontAgain("edited"));
        assertEquals(false, StringsChallenge.frontAgain("edit"));
        assertEquals(true, StringsChallenge.frontAgain("ed"));
        assertEquals(true, StringsChallenge.frontAgain("jj"));
        assertEquals(true, StringsChallenge.frontAgain("jjj"));
        assertEquals(true, StringsChallenge.frontAgain("jjjj"));
        assertEquals(false, StringsChallenge.frontAgain("jjjk"));
        assertEquals(false, StringsChallenge.frontAgain("x"));
        assertEquals(false, StringsChallenge.frontAgain(""));
        assertEquals(false, StringsChallenge.frontAgain("java"));
        assertEquals(true, StringsChallenge.frontAgain("javaja"));
    }

    @Test
    public void deFrontTest() {
        assertEquals("llo", StringsChallenge.deFront("Hello"));
        assertEquals("va", StringsChallenge.deFront("java"));
        assertEquals("aay", StringsChallenge.deFront("away"));
        assertEquals("ay", StringsChallenge.deFront("axy"));
        assertEquals("abc", StringsChallenge.deFront("abc"));
        assertEquals("by", StringsChallenge.deFront("xby"));
        assertEquals("ab", StringsChallenge.deFront("ab"));
        assertEquals("a", StringsChallenge.deFront("ax"));
        assertEquals("ab", StringsChallenge.deFront("axb"));
        assertEquals("aa", StringsChallenge.deFront("aaa"));
        assertEquals("bc", StringsChallenge.deFront("xbc"));
        assertEquals("bb", StringsChallenge.deFront("bbb"));
        assertEquals("zz", StringsChallenge.deFront("bazz"));
        assertEquals("", StringsChallenge.deFront("ba"));
        assertEquals("abxyz", StringsChallenge.deFront("abxyz"));
        assertEquals("", StringsChallenge.deFront("hi"));
        assertEquals("s", StringsChallenge.deFront("his"));
        assertEquals("", StringsChallenge.deFront("xz"));
        assertEquals("z", StringsChallenge.deFront("zzz"));
    }

    @Test
    public void without2Test() {
        assertEquals("lloHe", StringsChallenge.without2("HelloHe"));
        assertEquals("HelloHi", StringsChallenge.without2("HelloHi"));
        assertEquals("", StringsChallenge.without2("Hi"));
        assertEquals("Chocolate", StringsChallenge.without2("Chocolate"));
        assertEquals("x", StringsChallenge.without2("xxx"));
        assertEquals("", StringsChallenge.without2("xx"));
        assertEquals("x", StringsChallenge.without2("x"));
        assertEquals("", StringsChallenge.without2(""));
        assertEquals("Fruits", StringsChallenge.without2("Fruits"));
    }

    @Test
    public void testWithoutX2() {
        assertEquals("Hi", StringsChallenge.withoutX2("xHi"));
        assertEquals("Hi", StringsChallenge.withoutX2("Hxi"));
        assertEquals("Hi", StringsChallenge.withoutX2("Hi"));
        assertEquals("Hi", StringsChallenge.withoutX2("xxHi"));
        assertEquals("Hix", StringsChallenge.withoutX2("Hix"));
        assertEquals("axb", StringsChallenge.withoutX2("xaxb"));
        assertEquals("", StringsChallenge.withoutX2("xx"));
        assertEquals("", StringsChallenge.withoutX2("x"));
        assertEquals("", StringsChallenge.withoutX2(""));
        assertEquals("Hello", StringsChallenge.withoutX2("Hello"));
        assertEquals("Hexllo", StringsChallenge.withoutX2("Hexllo"));
        assertEquals("Hxllo", StringsChallenge.withoutX2("xHxllo"));
    }
}
