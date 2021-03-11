package com.example.chess

interface ChessDeligate {
    fun pieceAt(square: Square) : ChessPiece?
    fun movePiece(from: Square, to: Square)
}