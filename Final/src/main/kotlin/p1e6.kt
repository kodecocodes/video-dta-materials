/**
 * Copyright (c) 2020 Kodeco LLC

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
distribute, sublicense, create a derivative work, and/or sell copies of the
Software in any work that is designed, intended, or marketed for pedagogical or
instructional purposes related to programming, coding, application development,
or information technology.  Permission for such use, copying, modification,
merger, publication, distribution, sublicensing, creation of derivative works,
or sale is expressly withheld.

This project and source code may use libraries or frameworks that are
released under various Open-Source licenses. Use of those libraries and
frameworks are governed by their own individual licenses.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

 */

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit

fun main() {
  // ZoneDataTime vs Instant
  val romeZone = ZonedDateTime.of(
    LocalDateTime.of(2022, 3, 26, 10, 0),
    ZoneId.of("Europe/Rome")
  )

  println("romeZone: $romeZone")

  val instant1 = romeZone.plus(1, ChronoUnit.DAYS).toInstant()
  val instant2 = romeZone.toInstant().plus(1, ChronoUnit.DAYS)

  println("instant1: $instant1")
  println("instant2: $instant2")

  val zone1 = romeZone.plus(1, ChronoUnit.DAYS)
  println("zone1:$zone1")

  // Convert an Instant into a ZonedDateTime
  val currentInstant = Instant.now()
  val ztdFromInstant = currentInstant.atZone(ZoneId.systemDefault())
  println("ztdFromInstant: $ztdFromInstant")
}