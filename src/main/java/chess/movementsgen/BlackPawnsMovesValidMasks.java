package chess.movementsgen;

import chess.BitPosition;

public enum BlackPawnsMovesValidMasks {

    A7(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b10000000, //5
                    (byte) 0b10000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b10000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    B7(
            new BitPosition(new byte[]{
                    //      ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b01000000, //5
                    (byte) 0b01000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b01000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    C7(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00100000, //5
                    (byte) 0b00100000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00100000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    D7(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00010000, //5
                    (byte) 0b00010000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00010000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    E7(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00001000, //5
                    (byte) 0b00001000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00001000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    F7(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000100, //5
                    (byte) 0b00000100, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000100, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    G7(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000010, //5
                    (byte) 0b00000010, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000010, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    H7(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000001, //5
                    (byte) 0b00000001, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000001, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }));


    private BitPosition mask1, mask2;

    private BlackPawnsMovesValidMasks(BitPosition mask1, BitPosition mask2) {
        this.mask1 = mask1;
        this.mask2 = mask2;
    }


    public BitPosition getMask1() {
        return mask1;
    }

    public void setMask1(BitPosition mask1) {
        this.mask1 = mask1;
    }

    public BitPosition getMask2() {
        return mask2;
    }

    public void setMask2(BitPosition mask2) {
        this.mask2 = mask2;
    }
}
