                                                                                                                                                                                                                                                                                                                table bed
"Browser Extensible Data"
   (
   string chrom;       "Reference sequence chromosome or scaffold"
   uint   chromStart;  "Start position in chromosome"
   uint   chromEnd;    "End position in chromosome"
   string name;        "Name of item."
   uint score;          "Score (0-1000)"
   char[1] strand;     "+ or - for strand"
   uint thickStart;   "Start of where display should be thick (start codon)"
   uint thickEnd;     "End of where display should be thick (stop codon)"
   uint reserved;     "Used as itemRgb as of 2004-11-22"
   int blockCount;    "Number of blocks"
   int[blockCount] blockSizes; "Comma separated list of block sizes"
   int[blockCount] chromStarts; "Start positions relative to chromStart"
   int expCount;	"Experiment count"
   int[expCount] expIds;	"Comma separated list of experiment ids. Always 0,1,2,3...."
   float[expCount] expScores; "Comma separated list of experiment scores."
lstring field17;	"Undocumented field"
lstring field18;	"Undocumented field"
lstring field19;	"Undocumented field"
lstring field20;	"Undocumented field"
lstring field21;	"Undocumented field"
lstring field22;	"Undocumented field"
lstring field23;	"Undocumented field"
lstring field24;	"Undocumented field"
   )
                                                                                                         ���x                          chr1     gѡchr10   .��chr11   y*Echr12   Ux(chr13   �4chr14   �zuchr15   �
4chr16   ��chr17   ��chr18	   �Ihchr19
   �1�chr2    �\�
chr3    $��	chr4    �Y	chr5    E�	chr6    L��chr7    |s�chr8    N��chr9    �ichrX    �
�       