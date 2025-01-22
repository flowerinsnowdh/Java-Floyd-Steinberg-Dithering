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

import org.jetbrains.annotations.NotNull;

/**
 * 距离计算器
 * @author flowerinsnow
 */
public interface DistanceCalculator<T> {
    /**
     * 计算两个对象的距离
     *
     * @param a 第一个对象
     * @param b 第二个对象
     * @return 两个对象的距离
     */
    double calculate(@NotNull T a, @NotNull T b);
}
