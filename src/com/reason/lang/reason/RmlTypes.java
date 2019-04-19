package com.reason.lang.reason;

import com.reason.lang.core.stub.type.*;
import com.reason.lang.core.type.ORCompositeElementType;
import com.reason.lang.core.type.ORTokenElementType;
import com.reason.lang.core.type.ORTypes;

public class RmlTypes extends ORTypes {

    public static final RmlTypes INSTANCE = new RmlTypes();

    private RmlTypes() {
        // Stubbed element types

        C_EXTERNAL_STMT = new PsiExternalStubElementType("C_EXTERNAL_STMT", RmlLanguage.INSTANCE);
        C_LET_STMT = new PsiLetStubElementType("C_LET_STMT", RmlLanguage.INSTANCE);
        C_EXP_TYPE = new PsiTypeStubElementType("C_EXP_TYPE", RmlLanguage.INSTANCE);
        C_VAL_EXPR = new PsiValStubElementType("C_VAL_EXPR", RmlLanguage.INSTANCE);
        C_MODULE_STMT = new PsiModuleStubElementType("C_MODULE_STMT", RmlLanguage.INSTANCE);
        C_VARIANT_DECL = new PsiVariantDeclarationStubElementType("C_VARIANT_DECL", RmlLanguage.INSTANCE);
        C_EXCEPTION_EXPR = new PsiExceptionStubElementType("C_EXCEPTION_EXPR", RmlLanguage.INSTANCE);

        // Composite element types

        C_ANNOTATION_EXPR = new ORCompositeElementType("C_ANNOTATION_EXPR", RmlLanguage.INSTANCE);
        C_MIXIN_FIELD = new ORCompositeElementType("C_MIXIN_FIELD", RmlLanguage.INSTANCE);
        C_MODULE_PATH = new ORCompositeElementType("C_MODULE_PATH", RmlLanguage.INSTANCE);
        C_ASSERT_STMT = new ORCompositeElementType("C_ASSERT_STMT", RmlLanguage.INSTANCE);
        C_BIN_CONDITION = new ORCompositeElementType("C_BIN_CONDITION", RmlLanguage.INSTANCE);
        C_CLASS_STMT = new ORCompositeElementType("C_CLASS_STMT", RmlLanguage.INSTANCE);
        C_CLASS_CONSTR = new ORCompositeElementType("C_CLASS_CONSTR", RmlLanguage.INSTANCE);
        C_CLASS_PARAMS = new ORCompositeElementType("C_CLASS_PARAMS", RmlLanguage.INSTANCE);
        C_CLASS_FIELD = new ORCompositeElementType("C_CLASS_FIELD", RmlLanguage.INSTANCE);
        C_CLASS_METHOD = new ORCompositeElementType("C_CLASS_METHOD", RmlLanguage.INSTANCE);
        C_FUN_CALL_PARAMS = new ORCompositeElementType("C_FUN_CALL_PARAMS", RmlLanguage.INSTANCE);
        C_FUN_EXPR = new ORCompositeElementType("C_FUN_EXPR", RmlLanguage.INSTANCE);
        C_FUN_PARAM = new ORCompositeElementType("C_FUNCTION_PARAMETER", RmlLanguage.INSTANCE);
        C_FUN_PARAMS = new ORCompositeElementType("C_FUN_PARAMS", RmlLanguage.INSTANCE);
        C_FUN_BODY = new ORCompositeElementType("C_FUN_BODY", RmlLanguage.INSTANCE);
        C_FUNCTOR = new ORCompositeElementType("C_FUNCTOR", RmlLanguage.INSTANCE);
        C_FUNCTOR_BINDING = new ORCompositeElementType("C_FUNCTOR_BINDING", RmlLanguage.INSTANCE);
        C_FUNCTOR_CONSTRAINTS = new ORCompositeElementType("C_FUNCTOR_CONSTRAINTS", RmlLanguage.INSTANCE);
        C_FUNCTOR_PARAM = new ORCompositeElementType("C_FUNCTOR_PARAM", RmlLanguage.INSTANCE);
        C_FUNCTOR_PARAMS = new ORCompositeElementType("C_FUNCTOR_PARAMS", RmlLanguage.INSTANCE);
        C_IF_STMT = new ORCompositeElementType("C_IF_STMT", RmlLanguage.INSTANCE);
        C_INCLUDE = new ORCompositeElementType("C_INCLUDE", RmlLanguage.INSTANCE);
        C_INTERPOLATION_EXPR = new ORCompositeElementType("C_INTERPOLATION_EXPR", RmlLanguage.INSTANCE);
        C_JS_OBJECT = new ORCompositeElementType("C_JS_OBJECT", RmlLanguage.INSTANCE);
        C_JS_OBJECT_FIELD = new ORCompositeElementType("C_JS_OBJECT_FIELD", RmlLanguage.INSTANCE);
        C_LET_BINDING = new ORCompositeElementType("C_LET_BINDING", RmlLanguage.INSTANCE);
        C_LOWER_SYMBOL = new ORCompositeElementType("C_LOWER_SYMBOL", RmlLanguage.INSTANCE);
        C_MACRO_EXPR = new ORCompositeElementType("C_MACRO_EXPR", RmlLanguage.INSTANCE);
        C_MACRO_NAME = new ORCompositeElementType("C_MACRO_NAME", RmlLanguage.INSTANCE);
        C_MACRO_RAW_BODY = new ORCompositeElementType("C_MACRO_RAW_BODY", RmlLanguage.INSTANCE);
        C_ML_INTERPOLATOR = new ORCompositeElementType("C_ML_INTERPOLATOR", RmlLanguage.INSTANCE);
        C_OPTION = new ORCompositeElementType("C_OPTION", RmlLanguage.INSTANCE);
        C_OPEN = new ORCompositeElementType("C_OPEN", RmlLanguage.INSTANCE);
        C_PATTERN_MATCH_BODY = new ORCompositeElementType("C_PATTERN_MATCH_BODY", RmlLanguage.INSTANCE);
        C_PATTERN_MATCH_EXPR = new ORCompositeElementType("C_PATTERN_MATCH_EXPR", RmlLanguage.INSTANCE);
        C_RECORD_EXPR = new ORCompositeElementType("C_RECORD_EXPR", RmlLanguage.INSTANCE);
        C_RECORD_FIELD = new ORCompositeElementType("C_RECORD_FIELD", RmlLanguage.INSTANCE);
        C_RAW = new ORCompositeElementType("C_RAW", RmlLanguage.INSTANCE);
        C_SIG_EXPR = new ORCompositeElementType("C_SIG_EXPR", RmlLanguage.INSTANCE);
        C_SIG_ITEM = new ORCompositeElementType("C_SIG_ITEM", RmlLanguage.INSTANCE);
        C_SCOPED_EXPR = new ORCompositeElementType("C_SCOPED_EXPR", RmlLanguage.INSTANCE);
        C_STRUCT_EXPR = new ORCompositeElementType("C_STRUCT_EXPR", RmlLanguage.INSTANCE);
        C_SWITCH_EXPR = new ORCompositeElementType("C_SWITCH_EXPR", RmlLanguage.INSTANCE);
        C_TAG = new ORCompositeElementType("C_TAG", RmlLanguage.INSTANCE);
        C_TAG_PROP_VALUE = new ORCompositeElementType("C_TAG_PROP_VALUE", RmlLanguage.INSTANCE);
        C_TAG_BODY = new ORCompositeElementType("C_TAG_BODY", RmlLanguage.INSTANCE);
        C_TAG_START = new ORCompositeElementType("C_TAG_START", RmlLanguage.INSTANCE);
        C_TAG_CLOSE = new ORCompositeElementType("C_TAG_CLOSE", RmlLanguage.INSTANCE);
        C_TAG_PROPERTY = new ORCompositeElementType("C_TAG_PROPERTY", RmlLanguage.INSTANCE);
        C_TRY_EXPR = new ORCompositeElementType("C_TRY_EXPR", RmlLanguage.INSTANCE);
        C_TRY_BODY = new ORCompositeElementType("C_TRY_BODY", RmlLanguage.INSTANCE);
        C_TRY_HANDLER = new ORCompositeElementType("C_TRY_HANDLER", RmlLanguage.INSTANCE);
        C_TRY_HANDLERS = new ORCompositeElementType("C_TRY_HANDLERS", RmlLanguage.INSTANCE);
        C_TYPE_BINDING = new ORCompositeElementType("C_TYPE_BINDING", RmlLanguage.INSTANCE);
        C_TYPE_CONSTR_NAME = new ORCompositeElementType("C_TYPE_CONSTR_NAME", RmlLanguage.INSTANCE);
        C_UNIT = new ORCompositeElementType("C_UNIT", RmlLanguage.INSTANCE);
        C_UNKNOWN_EXPR = new ORCompositeElementType("C_UNKNOWN_EXPR", RmlLanguage.INSTANCE);
        C_UPPER_SYMBOL = new ORCompositeElementType("C_UPPER_SYMBOL", RmlLanguage.INSTANCE);
        C_VARIANT = new ORCompositeElementType("C_VARIANT", RmlLanguage.INSTANCE);
        C_VARIANT_CONSTRUCTOR = new ORCompositeElementType("C_VARIANT_CONSTRUCTOR", RmlLanguage.INSTANCE);

        // Token element types

        BOOL_VALUE = new ORTokenElementType("BOOL_VALUE", RmlLanguage.INSTANCE);
        STRING_VALUE = new ORTokenElementType("STRING_VALUE", RmlLanguage.INSTANCE);
        FLOAT_VALUE = new ORTokenElementType("FLOAT_VALUE", RmlLanguage.INSTANCE);
        CHAR_VALUE = new ORTokenElementType("CHAR_VALUE", RmlLanguage.INSTANCE);
        INT_VALUE = new ORTokenElementType("INT_VALUE", RmlLanguage.INSTANCE);
        EXCEPTION_NAME = new ORTokenElementType("EXCEPTION_NAME", RmlLanguage.INSTANCE);
        PROPERTY_NAME = new ORTokenElementType("PROPERTY_NAME", RmlLanguage.INSTANCE);
        GENERIC_COND = new ORTokenElementType("GENERIC_COND", RmlLanguage.INSTANCE);
        SWITCH = new ORTokenElementType("SWITCH", RmlLanguage.INSTANCE);
        FUNCTION = new ORTokenElementType("FUNCTION", RmlLanguage.INSTANCE);
        FUN = new ORTokenElementType("FUN", RmlLanguage.INSTANCE);
        FUNCTOR = new ORTokenElementType("FUNCTOR", RmlLanguage.INSTANCE);
        IF = new ORTokenElementType("IF", RmlLanguage.INSTANCE);
        C_LOCAL_OPEN = new ORTokenElementType("C_LOCAL_OPEN", RmlLanguage.INSTANCE);
        AND = new ORTokenElementType("AND", RmlLanguage.INSTANCE);
        ANDAND = new ORTokenElementType("ANDAND", RmlLanguage.INSTANCE);
        ARROBASE = new ORTokenElementType("ARROBASE", RmlLanguage.INSTANCE);
        ARROW = new ORTokenElementType("ARROW", RmlLanguage.INSTANCE);
        ASSERT = new ORTokenElementType("ASSERT", RmlLanguage.INSTANCE);
        AS = new ORTokenElementType("AS", RmlLanguage.INSTANCE);
        BACKTICK = new ORTokenElementType("BACKTICK", RmlLanguage.INSTANCE);
        BEGIN = new ORTokenElementType("BEGIN", RmlLanguage.INSTANCE);
        CARRET = new ORTokenElementType("CARRET", RmlLanguage.INSTANCE);
        COLON = new ORTokenElementType("COLON", RmlLanguage.INSTANCE);
        COMMA = new ORTokenElementType("COMMA", RmlLanguage.INSTANCE);
        COMMENT = new ORTokenElementType("COMMENT", RmlLanguage.INSTANCE);
        DIFF = new ORTokenElementType("DIFF", RmlLanguage.INSTANCE);
        LT_OR_EQUAL = new ORTokenElementType("LT_OR_EQUAL", RmlLanguage.INSTANCE);
        GT_OR_EQUAL = new ORTokenElementType("GT_OR_EQUAL", RmlLanguage.INSTANCE);
        DOLLAR = new ORTokenElementType("DOLLAR", RmlLanguage.INSTANCE);
        DOT = new ORTokenElementType("DOT", RmlLanguage.INSTANCE);
        DOTDOTDOT = new ORTokenElementType("DOTDOTDOT", RmlLanguage.INSTANCE);
        DO = new ORTokenElementType("DO", RmlLanguage.INSTANCE);
        DONE = new ORTokenElementType("DONE", RmlLanguage.INSTANCE);
        ELSE = new ORTokenElementType("ELSE", RmlLanguage.INSTANCE);
        END = new ORTokenElementType("END", RmlLanguage.INSTANCE);
        ENDIF = new ORTokenElementType("ENDIF", RmlLanguage.INSTANCE);
        NOT_EQ = new ORTokenElementType("EQ", RmlLanguage.INSTANCE);
        NOT_EQEQ = new ORTokenElementType("EQEQ", RmlLanguage.INSTANCE);
        EQ = new ORTokenElementType("EQ", RmlLanguage.INSTANCE);
        EQEQ = new ORTokenElementType("EQEQ", RmlLanguage.INSTANCE);
        EQEQEQ = new ORTokenElementType("EQEQEQ", RmlLanguage.INSTANCE);
        EXCEPTION = new ORTokenElementType("EXCEPTION", RmlLanguage.INSTANCE);
        EXCLAMATION_MARK = new ORTokenElementType("EXCLAMATION_MARK", RmlLanguage.INSTANCE);
        EXTERNAL = new ORTokenElementType("EXTERNAL", RmlLanguage.INSTANCE);
        FOR = new ORTokenElementType("FOR", RmlLanguage.INSTANCE);
        TYPE_ARGUMENT = new ORTokenElementType("TYPE_ARGUMENT", RmlLanguage.INSTANCE);
        GT = new ORTokenElementType("GT", RmlLanguage.INSTANCE);
        IN = new ORTokenElementType("IN", RmlLanguage.INSTANCE);
        LAZY = new ORTokenElementType("LAZY", RmlLanguage.INSTANCE);
        INCLUDE = new ORTokenElementType("INCLUDE", RmlLanguage.INSTANCE);
        LARRAY = new ORTokenElementType("LARRAY", RmlLanguage.INSTANCE);
        LBRACE = new ORTokenElementType("LBRACE", RmlLanguage.INSTANCE);
        LBRACKET = new ORTokenElementType("LBRACKET", RmlLanguage.INSTANCE);
        LET = new ORTokenElementType("LET", RmlLanguage.INSTANCE);
        LIDENT = new ORTokenElementType("LIDENT", RmlLanguage.INSTANCE);
        LPAREN = new ORTokenElementType("LPAREN", RmlLanguage.INSTANCE);
        LT = new ORTokenElementType("LT", RmlLanguage.INSTANCE);
        MATCH = new ORTokenElementType("MATCH", RmlLanguage.INSTANCE);
        MINUS = new ORTokenElementType("MINUS", RmlLanguage.INSTANCE);
        MINUSDOT = new ORTokenElementType("MINUSDOT", RmlLanguage.INSTANCE);
        MODULE = new ORTokenElementType("MODULE", RmlLanguage.INSTANCE);
        MUTABLE = new ORTokenElementType("MUTABLE", RmlLanguage.INSTANCE);
        NONE = new ORTokenElementType("NONE", RmlLanguage.INSTANCE);
        OF = new ORTokenElementType("OF", RmlLanguage.INSTANCE);
        OPEN = new ORTokenElementType("OPEN", RmlLanguage.INSTANCE);
        OPTION = new ORTokenElementType("OPTION", RmlLanguage.INSTANCE);
        POLY_VARIANT = new ORTokenElementType("POLY_VARIANT", RmlLanguage.INSTANCE);
        VARIANT_NAME = new ORTokenElementType("VARIANT_NAME", RmlLanguage.INSTANCE);
        PIPE = new ORTokenElementType("PIPE", RmlLanguage.INSTANCE);
        PIPE_FORWARD = new ORTokenElementType("PIPE_FORWARD", RmlLanguage.INSTANCE);
        PIPE_FIRST = new ORTokenElementType("PIPE_FIRST", RmlLanguage.INSTANCE);
        PLUS = new ORTokenElementType("PLUS", RmlLanguage.INSTANCE);
        PERCENT = new ORTokenElementType("PERCENT", RmlLanguage.INSTANCE);
        PLUSDOT = new ORTokenElementType("PLUSDOT", RmlLanguage.INSTANCE);
        QUESTION_MARK = new ORTokenElementType("QUESTION_MARK", RmlLanguage.INSTANCE);
        QUOTE = new ORTokenElementType("QUOTE", RmlLanguage.INSTANCE);
        RAISE = new ORTokenElementType("RAISE", RmlLanguage.INSTANCE);
        RARRAY = new ORTokenElementType("RARRAY", RmlLanguage.INSTANCE);
        RBRACE = new ORTokenElementType("RBRACE", RmlLanguage.INSTANCE);
        RBRACKET = new ORTokenElementType("RBRACKET", RmlLanguage.INSTANCE);
        REC = new ORTokenElementType("REC", RmlLanguage.INSTANCE);
        REF = new ORTokenElementType("REF", RmlLanguage.INSTANCE);
        RPAREN = new ORTokenElementType("RPAREN", RmlLanguage.INSTANCE);
        SEMI = new ORTokenElementType("SEMI", RmlLanguage.INSTANCE);
        SIG = new ORTokenElementType("SIG", RmlLanguage.INSTANCE);
        SHARP = new ORTokenElementType("SHARP", RmlLanguage.INSTANCE);
        SHARPSHARP = new ORTokenElementType("SHARPSHARP", RmlLanguage.INSTANCE);
        SHORTCUT = new ORTokenElementType("SHORTCUT", RmlLanguage.INSTANCE);
        SLASH = new ORTokenElementType("SLASH", RmlLanguage.INSTANCE);
        SLASHDOT = new ORTokenElementType("SLASHDOT", RmlLanguage.INSTANCE);
        SOME = new ORTokenElementType("SOME", RmlLanguage.INSTANCE);
        STAR = new ORTokenElementType("STAR", RmlLanguage.INSTANCE);
        STARDOT = new ORTokenElementType("STARDOT", RmlLanguage.INSTANCE);
        STRUCT = new ORTokenElementType("STRUCT", RmlLanguage.INSTANCE);
        TAG_AUTO_CLOSE = new ORTokenElementType("TAG_AUTO_CLOSE", RmlLanguage.INSTANCE);
        TAG_NAME = new ORTokenElementType("TAG_NAME", RmlLanguage.INSTANCE);
        TAG_LT = new ORTokenElementType("TAG_LT", RmlLanguage.INSTANCE);
        TAG_LT_SLASH = new ORTokenElementType("TAG_LT_SLASH", RmlLanguage.INSTANCE);
        TAG_GT = new ORTokenElementType("TAG_GT", RmlLanguage.INSTANCE);
        TILDE = new ORTokenElementType("TILDE", RmlLanguage.INSTANCE);
        TO = new ORTokenElementType("TO", RmlLanguage.INSTANCE);
        THEN = new ORTokenElementType("THEN", RmlLanguage.INSTANCE);
        TRY = new ORTokenElementType("TRY", RmlLanguage.INSTANCE);
        TYPE = new ORTokenElementType("TYPE", RmlLanguage.INSTANCE);
        UIDENT = new ORTokenElementType("UIDENT", RmlLanguage.INSTANCE);
        UNIT = new ORTokenElementType("UNIT", RmlLanguage.INSTANCE);
        VAL = new ORTokenElementType("VAL", RmlLanguage.INSTANCE);
        PUB = new ORTokenElementType("PUB", RmlLanguage.INSTANCE);
        PRI = new ORTokenElementType("PRI", RmlLanguage.INSTANCE);
        WHEN = new ORTokenElementType("WHEN", RmlLanguage.INSTANCE);
        WHILE = new ORTokenElementType("WHILE", RmlLanguage.INSTANCE);
        WITH = new ORTokenElementType("WITH", RmlLanguage.INSTANCE);
        RAW = new ORTokenElementType("RAW", RmlLanguage.INSTANCE);

        ASR = new ORTokenElementType("ASR", RmlLanguage.INSTANCE);
        CLASS = new ORTokenElementType("CLASS", RmlLanguage.INSTANCE);
        CONSTRAINT = new ORTokenElementType("CONSTRAINT", RmlLanguage.INSTANCE);
        DOWNTO = new ORTokenElementType("DOWNTO", RmlLanguage.INSTANCE);
        INHERIT = new ORTokenElementType("INHERIT", RmlLanguage.INSTANCE);
        INITIALIZER = new ORTokenElementType("INITIALIZER", RmlLanguage.INSTANCE);
        LAND = new ORTokenElementType("LAND", RmlLanguage.INSTANCE);
        LOR = new ORTokenElementType("LOR", RmlLanguage.INSTANCE);
        LSL = new ORTokenElementType("LSL", RmlLanguage.INSTANCE);
        LSR = new ORTokenElementType("LSR", RmlLanguage.INSTANCE);
        LXOR = new ORTokenElementType("LXOR", RmlLanguage.INSTANCE);
        METHOD = new ORTokenElementType("METHOD", RmlLanguage.INSTANCE);
        MOD = new ORTokenElementType("MOD", RmlLanguage.INSTANCE);
        NEW = new ORTokenElementType("NEW", RmlLanguage.INSTANCE);
        NONREC = new ORTokenElementType("NONREC", RmlLanguage.INSTANCE);
        OR = new ORTokenElementType("OR", RmlLanguage.INSTANCE);
        PRIVATE = new ORTokenElementType("PRIVATE", RmlLanguage.INSTANCE);
        VIRTUAL = new ORTokenElementType("VIRTUAL", RmlLanguage.INSTANCE);

        COLON_EQ = new ORTokenElementType("COLON_EQ", RmlLanguage.INSTANCE);
        COLON_GT = new ORTokenElementType("COLON_GT", RmlLanguage.INSTANCE);
        DOTDOT = new ORTokenElementType("DOTDOT", RmlLanguage.INSTANCE);
        SEMISEMI = new ORTokenElementType("SEMISEMI", RmlLanguage.INSTANCE);
        GT_BRACKET = new ORTokenElementType("GT_BRACKET", RmlLanguage.INSTANCE);
        GT_BRACE = new ORTokenElementType("GT_BRACE", RmlLanguage.INSTANCE);
        LEFT_ARROW = new ORTokenElementType("LEFT_ARROW", RmlLanguage.INSTANCE);
        RIGHT_ARROW = new ORTokenElementType("RIGHT_ARROW", RmlLanguage.INSTANCE);

        OBJECT = new ORTokenElementType("OBJECT", RmlLanguage.INSTANCE);
        RECORD = new ORTokenElementType("RECORD", RmlLanguage.INSTANCE);

        AMPERSAND = new ORTokenElementType("AMPERSAND", RmlLanguage.INSTANCE);
        BRACKET_GT = new ORTokenElementType("BRACKET_GT", RmlLanguage.INSTANCE);
        BRACKET_LT = new ORTokenElementType("BRACKET_LT", RmlLanguage.INSTANCE);
        BRACE_LT = new ORTokenElementType("BRACE_LT", RmlLanguage.INSTANCE);

        ML_STRING_OPEN = new ORTokenElementType("ML_STRING_OPEN", RmlLanguage.INSTANCE);
        ML_STRING_CLOSE = new ORTokenElementType("ML_STRING_CLOSE", RmlLanguage.INSTANCE);
        JS_STRING_OPEN = new ORTokenElementType("JS_STRING_OPEN", RmlLanguage.INSTANCE);
        JS_STRING_CLOSE = new ORTokenElementType("JS_STRING_CLOSE", RmlLanguage.INSTANCE);
        UNDERSCORE = new ORTokenElementType("UNDERSCORE", RmlLanguage.INSTANCE);
    }
}