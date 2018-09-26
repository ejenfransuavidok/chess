package chess.movementsgen;

import chess.BitPosition;

public enum KnightMoves {

    A1(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00100000, //2
                    (byte)0b01000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    B1(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00010000, //2
                    (byte)0b10100000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    C1(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b10001000, //2
                    (byte)0b01010000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    D1(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b01000100, //2
                    (byte)0b00101000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    E1(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00100010, //2
                    (byte)0b00010100, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    F1(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00010001, //2
                    (byte)0b00001010, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    G1(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00001000, //2
                    (byte)0b00000101, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    H1(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000100, //2
                    (byte)0b00000010, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    A2(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00100000, //1
                    (byte)0b00000000, //2
                    (byte)0b00100000, //3
                    (byte)0b01000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    B2(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00010000, //1
                    (byte)0b00000000, //2
                    (byte)0b00010000, //3
                    (byte)0b10100000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    C2(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b10001000, //1
                    (byte)0b00000000, //2
                    (byte)0b10001000, //3
                    (byte)0b01010000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    D2(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b01000100, //1
                    (byte)0b00000000, //2
                    (byte)0b01000100, //3
                    (byte)0b00101000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    E2(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00100010, //1
                    (byte)0b00000000, //2
                    (byte)0b00100010, //3
                    (byte)0b00010100, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    F2(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00010001, //1
                    (byte)0b00000000, //2
                    (byte)0b00010001, //3
                    (byte)0b00001010, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    G2(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00001000, //1
                    (byte)0b00000000, //2
                    (byte)0b00001000, //3
                    (byte)0b00000101, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    H2(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000100, //1
                    (byte)0b00000000, //2
                    (byte)0b00000100, //3
                    (byte)0b00000010, //4
                    (byte)0b00000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    A3(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b01000000, //1
                    (byte)0b00100000, //2
                    (byte)0b00000000, //3
                    (byte)0b00100000, //4
                    (byte)0b01000000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    B3(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b10100000, //1
                    (byte)0b00010000, //2
                    (byte)0b00000000, //3
                    (byte)0b00010000, //4
                    (byte)0b10100000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    C3(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b01010000, //1
                    (byte)0b10001000, //2
                    (byte)0b00000000, //3
                    (byte)0b10001000, //4
                    (byte)0b01010000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    D3(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00101000, //1
                    (byte)0b01000100, //2
                    (byte)0b00000000, //3
                    (byte)0b01000100, //4
                    (byte)0b00101000, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    E3(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00010100, //1
                    (byte)0b00100010, //2
                    (byte)0b00000000, //3
                    (byte)0b00100010, //4
                    (byte)0b00010100, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    F3(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00001010, //1
                    (byte)0b00010001, //2
                    (byte)0b00000000, //3
                    (byte)0b00010001, //4
                    (byte)0b00001010, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    G3(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000101, //1
                    (byte)0b00001000, //2
                    (byte)0b00000000, //3
                    (byte)0b00001000, //4
                    (byte)0b00000101, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    H3(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000010, //1
                    (byte)0b00000100, //2
                    (byte)0b00000000, //3
                    (byte)0b00000100, //4
                    (byte)0b00000010, //5
                    (byte)0b00000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    A4(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b01000000, //2
                    (byte)0b00100000, //3
                    (byte)0b00000000, //4
                    (byte)0b00100000, //5
                    (byte)0b01000000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    B4(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b10100000, //2
                    (byte)0b00010000, //3
                    (byte)0b00000000, //4
                    (byte)0b00010000, //5
                    (byte)0b10100000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    C4(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b01010000, //2
                    (byte)0b10001000, //3
                    (byte)0b00000000, //4
                    (byte)0b10001000, //5
                    (byte)0b01010000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    D4(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00101000, //2
                    (byte)0b01000100, //3
                    (byte)0b00000000, //4
                    (byte)0b01000100, //5
                    (byte)0b00101000, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    E4(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00010100, //2
                    (byte)0b00100010, //3
                    (byte)0b00000000, //4
                    (byte)0b00100010, //5
                    (byte)0b00010100, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    F4(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00001010, //2
                    (byte)0b00010001, //3
                    (byte)0b00000000, //4
                    (byte)0b00010001, //5
                    (byte)0b00001010, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    G4(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000101, //2
                    (byte)0b00001000, //3
                    (byte)0b00000000, //4
                    (byte)0b00001000, //5
                    (byte)0b00000101, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    H4(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000010, //2
                    (byte)0b00000100, //3
                    (byte)0b00000000, //4
                    (byte)0b00000100, //5
                    (byte)0b00000010, //6
                    (byte)0b00000000, //7
                    (byte)0b00000000  //8
            })),
    A5(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b01000000, //3
                    (byte)0b00100000, //4
                    (byte)0b00000000, //5
                    (byte)0b00100000, //6
                    (byte)0b01000000, //7
                    (byte)0b00000000  //8
            })),
    B5(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b10100000, //3
                    (byte)0b00010000, //4
                    (byte)0b00000000, //5
                    (byte)0b00010000, //6
                    (byte)0b10100000, //7
                    (byte)0b00000000  //8
            })),
    C5(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b01010000, //3
                    (byte)0b10001000, //4
                    (byte)0b00000000, //5
                    (byte)0b10001000, //6
                    (byte)0b01010000, //7
                    (byte)0b00000000  //8
            })),
    D5(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00101000, //3
                    (byte)0b01000100, //4
                    (byte)0b00000000, //5
                    (byte)0b01000100, //6
                    (byte)0b00101000, //7
                    (byte)0b00000000  //8
            })),
    E5(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00010100, //3
                    (byte)0b00100010, //4
                    (byte)0b00000000, //5
                    (byte)0b00100010, //6
                    (byte)0b00010100, //7
                    (byte)0b00000000  //8
            })),
    F5(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00001010, //3
                    (byte)0b00010001, //4
                    (byte)0b00000000, //5
                    (byte)0b00010001, //6
                    (byte)0b00001010, //7
                    (byte)0b00000000  //8
            })),
    G5(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000101, //3
                    (byte)0b00001000, //4
                    (byte)0b00000000, //5
                    (byte)0b00001000, //6
                    (byte)0b00000101, //7
                    (byte)0b00000000  //8
            })),
    H5(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000010, //3
                    (byte)0b00000100, //4
                    (byte)0b00000000, //5
                    (byte)0b00000100, //6
                    (byte)0b00000010, //7
                    (byte)0b00000000  //8
            })),
    A6(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b01000000, //4
                    (byte)0b00100000, //5
                    (byte)0b00000000, //6
                    (byte)0b00100000, //7
                    (byte)0b01000000  //8
            })),
    B6(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b10100000, //4
                    (byte)0b00010000, //5
                    (byte)0b00000000, //6
                    (byte)0b00010000, //7
                    (byte)0b10100000  //8
            })),
    C6(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b01010000, //4
                    (byte)0b10001000, //5
                    (byte)0b00000000, //6
                    (byte)0b10001000, //7
                    (byte)0b01010000  //8
            })),
    D6(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00101000, //4
                    (byte)0b01000100, //5
                    (byte)0b00000000, //6
                    (byte)0b01000100, //7
                    (byte)0b00101000  //8
            })),
    E6(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00010100, //4
                    (byte)0b00100010, //5
                    (byte)0b00000000, //6
                    (byte)0b00100010, //7
                    (byte)0b00010100  //8
            })),
    F6(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00001010, //4
                    (byte)0b00010001, //5
                    (byte)0b00000000, //6
                    (byte)0b00010001, //7
                    (byte)0b00001010  //8
            })),
    G6(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000101, //4
                    (byte)0b00001000, //5
                    (byte)0b00000000, //6
                    (byte)0b00001000, //7
                    (byte)0b00000101  //8
            })),
    H6(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000010, //4
                    (byte)0b00000100, //5
                    (byte)0b00000000, //6
                    (byte)0b00000100, //7
                    (byte)0b00000010  //8
            })),
    A7(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b01000000, //5
                    (byte)0b00100000, //6
                    (byte)0b00000000, //7
                    (byte)0b00100000  //8
            })),
    B7(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b10100000, //5
                    (byte)0b00010000, //6
                    (byte)0b00000000, //7
                    (byte)0b00010000  //8
            })),
    C7(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b01010000, //5
                    (byte)0b10001000, //6
                    (byte)0b00000000, //7
                    (byte)0b10001000  //8
            })),
    D7(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00101000, //5
                    (byte)0b01000100, //6
                    (byte)0b00000000, //7
                    (byte)0b01000100  //8
            })),
    E7(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00010100, //5
                    (byte)0b00100010, //6
                    (byte)0b00000000, //7
                    (byte)0b00100010  //8
            })),
    F7(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00001010, //5
                    (byte)0b00010001, //6
                    (byte)0b00000000, //7
                    (byte)0b00010001  //8
            })),
    G7(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000101, //5
                    (byte)0b00001000, //6
                    (byte)0b00000000, //7
                    (byte)0b00001000  //8
            })),
    H7(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000010, //5
                    (byte)0b00000100, //6
                    (byte)0b00000000, //7
                    (byte)0b00000100  //8
            })),
    A8(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b01000000, //6
                    (byte)0b00100000, //7
                    (byte)0b00000000  //8
            })),
    B8(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b10100000, //6
                    (byte)0b00010000, //7
                    (byte)0b00000000  //8
            })),
    C8(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b01010000, //6
                    (byte)0b10001000, //7
                    (byte)0b00000000  //8
            })),
    D8(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00101000, //6
                    (byte)0b01000100, //7
                    (byte)0b00000000  //8
            })),
    E8(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00010100, //6
                    (byte)0b00100010, //7
                    (byte)0b00000000  //8
            })),
    F8(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00001010, //6
                    (byte)0b00010001, //7
                    (byte)0b00000000  //8
            })),
    G8(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000101, //6
                    (byte)0b00001000, //7
                    (byte)0b00000000  //8
            })),
    H8(
            new BitPosition(new byte [] {
                    //      ABCDEFGH
                    (byte)0b00000000, //1
                    (byte)0b00000000, //2
                    (byte)0b00000000, //3
                    (byte)0b00000000, //4
                    (byte)0b00000000, //5
                    (byte)0b00000010, //6
                    (byte)0b00000100, //7
                    (byte)0b00000000  //8
            }));
    private BitPosition value;

    private KnightMoves(BitPosition value) {
        this.value = value;
    }

    public BitPosition getValue() {
        return value;
    }

}
