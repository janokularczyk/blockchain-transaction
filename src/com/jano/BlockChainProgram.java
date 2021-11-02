package com.jano;

import java.util.*;

public class BlockChainProgram {

    public static void main(String[] args) {

        // demonstrate a series of blocks in a chain
        // block 1
        ArrayList<Block> blockChain = new ArrayList<Block>();

        String[] initialValues = {"Shad has 700$", "Miguel has 500$"};
        Block firstBlock = new Block(initialValues, 0);
        blockChain.add(firstBlock);

        System.out.println("first block: " + firstBlock.toString());
        System.out.println("blockchain: " + blockChain.toString());

        // block 2
        String[] shadTransaction = {"Shad gives $400", "Shad gives Tany $60", "Shad gives Terry $100"};
        Block secondBlock = new Block(shadTransaction, firstBlock.getBlockHash());
        blockChain.add(secondBlock);

        System.out.println("second block: " + secondBlock.toString());
        System.out.println("blockchain: " + blockChain.toString());

        // block 3
        String[] shadReceives = {"Tim gives Shad 10$", "Terry gives $50 to Shad"};
        Block thirdBlock = new Block(shadReceives, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);

        System.out.println("third block: " + thirdBlock.toString());
        System.out.println("blockchain: " + blockChain.toString());
    }
}
