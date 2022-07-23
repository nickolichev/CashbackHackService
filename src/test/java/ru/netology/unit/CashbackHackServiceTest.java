package ru.netology.unit;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

  CashbackHackService service = new CashbackHackService();

  @org.junit.Test
  public void remainTestFirst() {

    int expected = 200;
    int amount = 800;
    int result = service.remain(amount);

    assertEquals(expected, result);
  }

  @org.junit.Test
  public void remainTestSecond() {

    int expected = 1;
    int amount = 999;
    int result = service.remain(amount);

    assertEquals(expected, result);
  }

  @org.junit.Test
  public void remainTestThird() {

    int expected = 999;
    int amount = 1001;
    int result = service.remain(amount);

    assertEquals(expected, result);
  }

  @org.junit.Test
  public void remainFalse() {

    int expected = 0;
    int amount = 1000;
    int result = service.remain(amount);

    assertEquals(expected, result);
  }
}