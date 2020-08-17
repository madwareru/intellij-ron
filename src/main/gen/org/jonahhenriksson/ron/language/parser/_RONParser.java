// This is a generated file. Not intended for manual editing.
package org.jonahhenriksson.ron.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.jonahhenriksson.ron.language.psi.RONTypes.*;
import static org.jonahhenriksson.ron.language.psi.RONParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class _RONParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return RON(b, l + 1);
  }

  /* ********************************************************** */
  // [extension+] value
  static boolean RON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RON")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RON_0(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [extension+]
  private static boolean RON_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RON_0")) return false;
    RON_0_0(b, l + 1);
    return true;
  }

  // extension+
  private static boolean RON_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RON_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extension(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!extension(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RON_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BOOLEAN
  static boolean bool(PsiBuilder b, int l) {
    return consumeToken(b, BOOLEAN);
  }

  /* ********************************************************** */
  // CHAR
  static boolean char_$(PsiBuilder b, int l) {
    return consumeToken(b, CHAR);
  }

  /* ********************************************************** */
  // IDENT tuple
  static boolean enum_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_$")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && tuple(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXTENSION
  static boolean extension(PsiBuilder b, int l) {
    return consumeToken(b, EXTENSION);
  }

  /* ********************************************************** */
  // FLOAT
  static boolean float_$(PsiBuilder b, int l) {
    return consumeToken(b, FLOAT);
  }

  /* ********************************************************** */
  // "[" [value (COMMA value)* [COMMA WS*]] "]"
  static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, BRACKETL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKETL);
    r = r && list_1(b, l + 1);
    r = r && consumeToken(b, BRACKETR);
    exit_section_(b, m, null, r);
    return r;
  }

  // [value (COMMA value)* [COMMA WS*]]
  private static boolean list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    list_1_0(b, l + 1);
    return true;
  }

  // value (COMMA value)* [COMMA WS*]
  private static boolean list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && list_1_0_1(b, l + 1);
    r = r && list_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA value)*
  private static boolean list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA value
  private static boolean list_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA WS*]
  private static boolean list_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_2")) return false;
    list_1_0_2_0(b, l + 1);
    return true;
  }

  // COMMA WS*
  private static boolean list_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && list_1_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean list_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "list_1_0_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "{" [map_entry (COMMA map_entry)*  [COMMA WS*]] "}"
  static boolean map(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map")) return false;
    if (!nextTokenIs(b, BRACEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACEL);
    r = r && map_1(b, l + 1);
    r = r && consumeToken(b, BRACER);
    exit_section_(b, m, null, r);
    return r;
  }

  // [map_entry (COMMA map_entry)*  [COMMA WS*]]
  private static boolean map_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1")) return false;
    map_1_0(b, l + 1);
    return true;
  }

  // map_entry (COMMA map_entry)*  [COMMA WS*]
  private static boolean map_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = map_entry(b, l + 1);
    r = r && map_1_0_1(b, l + 1);
    r = r && map_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA map_entry)*
  private static boolean map_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!map_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "map_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA map_entry
  private static boolean map_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && map_entry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA WS*]
  private static boolean map_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0_2")) return false;
    map_1_0_2_0(b, l + 1);
    return true;
  }

  // COMMA WS*
  private static boolean map_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && map_1_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean map_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "map_1_0_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // value ":" value
  static boolean map_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_entry")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT ":"value
  static boolean named_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_field")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "Some" "(" value ")"
  static boolean option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "option")) return false;
    if (!nextTokenIs(b, SOME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SOME, PARENTHESISL);
    r = r && value(b, l + 1);
    r = r && consumeToken(b, PARENTHESISR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SIGNED
  static boolean signed(PsiBuilder b, int l) {
    return consumeToken(b, SIGNED);
  }

  /* ********************************************************** */
  // RAW_STRING | STRING
  static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, "", RAW_STRING, STRING)) return false;
    boolean r;
    r = consumeToken(b, RAW_STRING);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  /* ********************************************************** */
  // [IDENT] "(" [named_field (COMMA named_field)* [COMMA]] ")" | IDENT | "(" ")"
  static boolean struct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct")) return false;
    if (!nextTokenIs(b, "", IDENT, PARENTHESISL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = parseTokens(b, 0, PARENTHESISL, PARENTHESISR);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IDENT] "(" [named_field (COMMA named_field)* [COMMA]] ")"
  private static boolean struct_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_0_0(b, l + 1);
    r = r && consumeToken(b, PARENTHESISL);
    r = r && struct_0_2(b, l + 1);
    r = r && consumeToken(b, PARENTHESISR);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IDENT]
  private static boolean struct_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_0_0")) return false;
    consumeToken(b, IDENT);
    return true;
  }

  // [named_field (COMMA named_field)* [COMMA]]
  private static boolean struct_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_0_2")) return false;
    struct_0_2_0(b, l + 1);
    return true;
  }

  // named_field (COMMA named_field)* [COMMA]
  private static boolean struct_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = named_field(b, l + 1);
    r = r && struct_0_2_0_1(b, l + 1);
    r = r && struct_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA named_field)*
  private static boolean struct_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_0_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA named_field
  private static boolean struct_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && named_field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean struct_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_0_2_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // "(" [value (COMMA value)*] ")"
  static boolean tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple")) return false;
    if (!nextTokenIs(b, PARENTHESISL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESISL);
    r = r && tuple_1(b, l + 1);
    r = r && consumeToken(b, PARENTHESISR);
    exit_section_(b, m, null, r);
    return r;
  }

  // [value (COMMA value)*]
  private static boolean tuple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1")) return false;
    tuple_1_0(b, l + 1);
    return true;
  }

  // value (COMMA value)*
  private static boolean tuple_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && tuple_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA value)*
  private static boolean tuple_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA value
  private static boolean tuple_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UNSIGNED
  static boolean unsigned(PsiBuilder b, int l) {
    return consumeToken(b, UNSIGNED);
  }

  /* ********************************************************** */
  // string | char | bool | struct | tuple | map | list | enum | option | unsigned | signed | float
  static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    r = string(b, l + 1);
    if (!r) r = char_$(b, l + 1);
    if (!r) r = bool(b, l + 1);
    if (!r) r = struct(b, l + 1);
    if (!r) r = tuple(b, l + 1);
    if (!r) r = map(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = enum_$(b, l + 1);
    if (!r) r = option(b, l + 1);
    if (!r) r = unsigned(b, l + 1);
    if (!r) r = signed(b, l + 1);
    if (!r) r = float_$(b, l + 1);
    return r;
  }

}
