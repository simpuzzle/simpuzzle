/*
 * Copyright (C) 17/05/13 Romain Reuillon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.geocite.simpuzzle.neighbourhood

trait VonNeumannMatrixNeighbourhood <: MatrixNeighbourhood {
  def neighborhoodSize: Int

  def neighbors[T](cells: (Int, Int) => T, i: Int, j: Int) =
    for {
      oi <- -neighborhoodSize to neighborhoodSize
      oj <- -neighborhoodSize to neighborhoodSize
      if (oi != 0 && oj != 0)
    } yield cells(i + oi, j + oj)

}
