package com.example.ejercicioskotlin.medio

fun main() {
    val winningBid = Bid(5200, "Private Collector")

    println("Item A is sold at ${auctionPrice(null, 2000)}.")
    println("Item B is sold at ${auctionPrice(winningBid, 3150)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    // Fill in the code.

    return bid?.amount ?: minimumPrice

    /*bid?.let {
        return it.amount
    }
    return minimumPrice*/

    /*if (bid != null) {
        return bid.amount
    } else {
        return minimumPrice
    }*/
}