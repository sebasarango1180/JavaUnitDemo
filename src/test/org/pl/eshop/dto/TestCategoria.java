package test.org.pl.eshop.dto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.pl.eshop.dto.Categoria;


public class TestCategoria {

    public TestCategoria() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //Testing setId() method -> case id is 0
    @Test (expected = IllegalArgumentException.class)
    public void positiveId() {
        Categoria categoria = new Categoria();
        categoria.setId(0);
    }

    //Testing setId() method -> case id is Null
    @Test (expected = IllegalArgumentException.class)
    public void nullId() {
        Categoria categoria = new Categoria();
        categoria.setId(null);
    }

    //Testing setNombre() method -> case empty name string
    @Test (expected = IllegalArgumentException.class)
    public void emptyStringName() {
        Categoria categoria = new Categoria();
        categoria.setNombre("");
    }

    //Testing setNombre() method -> case name is Null
    @Test (expected = IllegalArgumentException.class)
    public void nullName() {
        Categoria categoria = new Categoria();
        categoria.setNombre(null);
    }

    //Testing setNombre() method -> case nombre is 'se' (short string)
    @Test (expected = IllegalArgumentException.class)
    public void nameUnderThreeChars() {
        Categoria categoria = new Categoria();
        categoria.setNombre("se");
    }

    //Testing getNombre() method -> case default name is an empty string
    @Test
    public void emptyDefaultName() {
        Categoria categoria = new Categoria();
        assertEquals(categoria.getNombre(), "");
    }
}
