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

import java.util.Collection;

/**
 * 调色盘，用以限制颜色范围
 * @author flowerinsnow
 */
public interface ColourPalette<C extends RGBColour> {
    /**
     * 返回调色盘中的所有颜色
     *
     * @return 调色盘中的所有颜色
     */
    @NotNull Collection<@NotNull C> colours();

    /**
     * 获取调色盘中距离 {@code colour} 最新的颜色
     *
     * @param colour 要对比的颜色
     * @return 调色盘中距离 {@code colour} 最新的颜色
     */
    @NotNull C getClosestColour(@NotNull C colour, @NotNull DistanceCalculator<C> calculator);
}
