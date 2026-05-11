# alstrudat-c08-ifs24019

## Description

Diberikan sekumpulan data nilai ujian mahasiswa. Setiap data terdiri dari **NIM**, **Nama**, dan **Nilai** (integer). Tugasmu adalah mengurutkan data tersebut menggunakan **Merge Sort** berdasarkan:
1. **Nilai** secara **descending** (terbesar ke terkecil)
2. Jika nilai sama, urutkan berdasarkan **NIM** secara **ascending**

### Format Input
```
n
NIM_1
Nama_1
Nilai_1
NIM_2
Nama_2
Nilai_2
...
```

### Format Output
```
NIM|Nama|Nilai
NIM|Nama|Nilai
...
```

## Source Codes

| No | File | Deskripsi |
|----|------|-----------|
| 1 | App.java | Bawaan |
| 2 | Student.java | Bawaan |
| 3 | Program.java | Implementasikan Merge Sort di sini |

## Test Cases

| No | Input | Output |
|----|-------|--------|
| 1 | 3<br/>ifs24001<br/>Alice<br/>85<br/>ifs24002<br/>Bob<br/>90<br/>ifs24003<br/>Charlie<br/>85 | ifs24002\|Bob\|90<br/>ifs24001\|Alice\|85<br/>ifs24003\|Charlie\|85 |
| 2 | 4<br/>ifs24001<br/>Alice<br/>70<br/>ifs24002<br/>Bob<br/>70<br/>ifs24003<br/>Charlie<br/>70<br/>ifs24004<br/>Diana<br/>70 | ifs24001\|Alice\|70<br/>ifs24002\|Bob\|70<br/>ifs24003\|Charlie\|70<br/>ifs24004\|Diana\|70 |
| 3 | 1<br/>ifs24001<br/>Alice<br/>100 | ifs24001\|Alice\|100 |
| 4 | 5<br/>ifs24005<br/>Eve<br/>60<br/>ifs24004<br/>Diana<br/>75<br/>ifs24003<br/>Charlie<br/>90<br/>ifs24002<br/>Bob<br/>85<br/>ifs24001<br/>Alice<br/>100 | ifs24001\|Alice\|100<br/>ifs24003\|Charlie\|90<br/>ifs24002\|Bob\|85<br/>ifs24004\|Diana\|75<br/>ifs24005\|Eve\|60 |
| 5 | 2<br/>ifs24002<br/>Bob<br/>95<br/>ifs24001<br/>Alice<br/>95 | ifs24001\|Alice\|95<br/>ifs24002\|Bob\|95 |
| 6 | 3<br/>ifs24003<br/>Charlie<br/>0<br/>ifs24001<br/>Alice<br/>0<br/>ifs24002<br/>Bob<br/>0 | ifs24001\|Alice\|0<br/>ifs24002\|Bob\|0<br/>ifs24003\|Charlie\|0 |
| 7 | 5<br/>ifs24001<br/>Alice<br/>100<br/>ifs24002<br/>Bob<br/>100<br/>ifs24003<br/>Charlie<br/>100<br/>ifs24004<br/>Diana<br/>100<br/>ifs24005<br/>Eve<br/>100 | ifs24001\|Alice\|100<br/>ifs24002\|Bob\|100<br/>ifs24003\|Charlie\|100<br/>ifs24004\|Diana\|100<br/>ifs24005\|Eve\|100 |
| 8 | 4<br/>ifs24004<br/>Diana<br/>55<br/>ifs24002<br/>Bob<br/>80<br/>ifs24001<br/>Alice<br/>80<br/>ifs24003<br/>Charlie<br/>55 | ifs24001\|Alice\|80<br/>ifs24002\|Bob\|80<br/>ifs24003\|Charlie\|55<br/>ifs24004\|Diana\|55 |
| 9 | 3<br/>ifs24003<br/>Charlie<br/>45<br/>ifs24001<br/>Alice<br/>78<br/>ifs24002<br/>Bob<br/>62 | ifs24001\|Alice\|78<br/>ifs24002\|Bob\|62<br/>ifs24003\|Charlie\|45 |
| 10 | 6<br/>ifs24006<br/>Frank<br/>88<br/>ifs24001<br/>Alice<br/>88<br/>ifs24003<br/>Charlie<br/>72<br/>ifs24004<br/>Diana<br/>72<br/>ifs24002<br/>Bob<br/>95<br/>ifs24005<br/>Eve<br/>60 | ifs24002\|Bob\|95<br/>ifs24001\|Alice\|88<br/>ifs24006\|Frank\|88<br/>ifs24003\|Charlie\|72<br/>ifs24004\|Diana\|72<br/>ifs24005\|Eve\|60 |

## Compile

```
mvn clean package
```

## Run

```
java -cp target/app.jar del.alstrudat.App
```
