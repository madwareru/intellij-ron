package org.jonahhenriksson.ron.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jonahhenriksson.ron.language.RONLanguage;

public class RONTokenType extends IElementType {

    public RONTokenType(@NotNull @NonNls String debugName) {
        super(debugName, RONLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return  "RONTokenType." + super.toString();
    }
}
