/*
 * Copyright (C) 2025  flowerinsnow
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package cn.flowerinsnow.dithering.common;

/**
 * RGB 颜色
 * @author flowerinsnow
 */
public interface RGBColour {
    /**
     * 获取 RGB 红色
     *
     * @return RGB 红色
     */
    short red();

    /**
     * 获取 RGB 绿色
     *
     * @return RGB 红色
     */
    short green();

    /**
     * 获取 RGB 蓝色
     *
     * @return RGB 红色
     */
    short blue();

//    /**
//     * 返回一个新的分别为 RGB 加上了 {@code val} 的 RGB 颜色
//     *
//     * @param val 要加上的 MathColour
//     * @return 一个新的分别为 RGB 加上了 {@code val} 的 RGB 颜色
//     */
//    @NotNull MathColour add(@NotNull MathColour val);
//
//    /**
//     * 返回一个新的分别为 RGB 乘以上了 {@code val} 的 RGB 颜色
//     *
//     * @param val 要乘以上的 MathColour
//     * @return 一个新的分别为 RGB 乘以上了 {@code val} 的 RGB 颜色
//     */
//    @NotNull MathColour multiply(@NotNull MathColour val);
//
//    /**
//     * 返回一个新的分别为 RGB 取负值的 RGB 颜色
//     *
//     * @return 一个新的分别为 RGB 取负值的 RGB 颜色
//     */
//    @NotNull MathColour negate();
//
//    /**
//     * 返回一个新的分别为 RGB 限制了 0-255 范围的 RGB 颜色
//     *
//     * @return 一个新的分别为 RGB 限制了 0-255 范围的 RGB 颜色
//     */
//    @NotNull MathColour normalize();
}
