# codetrans issue (2nd error)

reproducer project for a codetrans issue, when a string with \u-escaped values
is used the files generated by codetrans for js and groovy have the unquoted
representation of the string in the source. this causes a parse error in
asciidoctor with invalid utf8 sequence or leaves binary chars in the file it is
valid utf8.

the same error was fixed for examples includes before, looks like the code is
converted differently for code in the asciidoc source.
