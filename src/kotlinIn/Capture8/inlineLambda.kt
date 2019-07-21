package kotlinIn.Capture8

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock

inline fun <T> synchronized(lock: Lock, action: () -> T): T{
    lock.lock()
    try {
        return action()
    }
    finally {
        lock.unlock()
    }
}

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br -> return br.readLine() }
}