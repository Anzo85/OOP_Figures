package org.anzo.figures.tests;

import org.anzo.figures.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by andreyz on 20.09.16.
 */
public class Tests {
    Square s;
    Square s2;
    Rectangle r;
    Triangle t;
    Figures[] set;
    Main mobj;

    @Before

    public void setUP() {
        s = new Square(8);
        s2 = new Square(8);
        r = new Rectangle(4, 5);
        t = new Triangle(4, 12);
        set = new Figures[]{s, r, t};
        mobj = new Main();
    }


    @Test
    public void squareAreaTet() {

        assertThat(s.area(), is(64.0));

    }

    @Test
    public void rectangleAreaTet() {

        assertThat(r.area(), is(20.0));

    }

    @Test
    public void triangleAreaTet() {

        assertThat(t.area(), is(24.0));

    }

    @Test
    public void squarePerimeterTest() {

        assertThat(s.perimeter(), is(32.0));

    }

    @Test
    public void rectanglePerimeterTest() {

        assertThat(r.perimeter(), is(18.0));

    }

    @Test
    public void trianglePerimeterTest() {

        assertThat(t.perimeter(), is(16.0));

    }

    @Test
    public void resultTest() {

        assertThat(mobj.arrayResult(set), is(174.0));
    }

    @Test
    public void equalsOverrideTest() {

        assertThat(s.equals(s2), is(true));
    }

}
