package ru.netology.unit;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

  CashbackHackService service = new CashbackHackService();

  @org.testng.annotations.Test
  void remainTestFirst() {

    int expected = 200;
    int amount = 800;
    int result = service.remain(amount);

    assertEquals(result, expected);
  }

  @org.testng.annotations.Test
  void remainTestSecond() {

    int expected = 1;
    int amount = 999;
    int result = service.remain(amount);

    assertEquals(result, expected);
  }

  @org.testng.annotations.Test
  void remainTestThird() {

    int expected = 999;
    int amount = 1001;
    int result = service.remain(amount);

    assertEquals(result, expected);
  }

  @org.testng.annotations.Test
  void remainFalse() {

    int expected = 0;
    int amount = 1000;
    int result = service.remain(amount);

    assertEquals(result, expected);
  }

}