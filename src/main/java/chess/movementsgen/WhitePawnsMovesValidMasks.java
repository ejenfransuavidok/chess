package chess.movementsgen;

import chess.BitPosition;

public enum WhitePawnsMovesValidMasks {

    A2(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b10000000, //3
                    (byte) 0b10000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b10000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    B2(
            new BitPosition(new byte[]{
                    //      ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b01000000, //3
                    (byte) 0b01000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b01000000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    C2(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00100000, //3
                    (byte) 0b00100000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00100000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    D2(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00010000, //3
                    (byte) 0b00010000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00010000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    E2(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00001000, //3
                    (byte) 0b00001000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00001000, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    F2(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000100, //3
                    (byte) 0b00000100, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000100, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    G2(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000010, //3
                    (byte) 0b00000010, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000010, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            })),
    H2(
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000001, //3
                    (byte) 0b00000001, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }),
            new BitPosition(new byte[]{
                    //       ABCDEFGH
                    (byte) 0b00000000, //1
                    (byte) 0b00000000, //2
                    (byte) 0b00000001, //3
                    (byte) 0b00000000, //4
                    (byte) 0b00000000, //5
                    (byte) 0b00000000, //6
                    (byte) 0b00000000, //7
                    (byte) 0b00000000  //8
            }));


    private BitPosition mask1, mask2;

    private WhitePawnsMovesValidMasks(BitPosition mask1, BitPosition mask2) {
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
