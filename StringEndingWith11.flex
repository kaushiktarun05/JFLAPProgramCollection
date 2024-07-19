%%

%class EndsWith11
%unicode
%public
%function isEndsWith11
%type boolean
%{
    private boolean result;
%}

%%

.*11       { result = true; return true; }
[^]*       { result = false; return false; }

%%

public boolean isEndsWith11() {
    return result;
}
