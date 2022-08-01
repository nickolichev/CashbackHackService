package ru.netology.unit;

public class CashbackHackService {

    private final int boundary = 500;

    public int remain(int amount) {
      return boundary - amount % boundary;

    }
}