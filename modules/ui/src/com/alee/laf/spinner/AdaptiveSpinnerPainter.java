package com.alee.laf.spinner;

import com.alee.extended.painter.AdaptivePainter;
import com.alee.extended.painter.Painter;

import javax.swing.*;

/**
 * Simple SpinnerPainter adapter class.
 * It is used to install simple non-specific painters into WebSpinnerUI.
 *
 * @author Alexandr Zernov
 */

public class AdaptiveSpinnerPainter<E extends JSpinner, U extends WebSpinnerUI> extends AdaptivePainter<E, U>
        implements SpinnerPainter<E, U>
{
    /**
     * Constructs new AdaptiveSpinnerPainter for the specified painter.
     *
     * @param painter painter to adapt
     */
    public AdaptiveSpinnerPainter ( final Painter painter )
    {
        super ( painter );
    }
}
