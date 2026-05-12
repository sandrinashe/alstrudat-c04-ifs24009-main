# alstrudat-c08-ifs24019

## Description

Kamu diberikan data nilai ujian dari sejumlah mahasiswa. Setiap mahasiswa memiliki tiga atribut yaitu **NIM**, **Nama**, dan **Nilai** ujian berupa bilangan bulat.

Tugasmu adalah membuat program yang dapat **mengurutkan data mahasiswa** tersebut menggunakan algoritma **Merge Sort** dengan aturan pengurutan sebagai berikut:

- **Utama** → Urutkan berdasarkan **Nilai** dari yang **terbesar ke terkecil** (descending)
- **Sekunder** → Jika dua mahasiswa memiliki **Nilai yang sama**, urutkan berdasarkan **NIM** dari yang **terkecil ke terbesar** (ascending)

Logika pengurutan ini harus kamu implementasikan sendiri di dalam file `Program.java` pada method `mergeSort`. Dilarang menggunakan fungsi sort bawaan Java seperti `Arrays.sort()` atau `Collections.sort()`.

---

## Ketentuan

| Atribut                   | Ketentuan                                 |
|---------------------------|-------------------------------------------|
| Jumlah mahasiswa (`n`)    | Bilangan bulat positif, 1 ≤ n ≤ 100       |
| NIM                       | String tanpa spasi, contoh: `ifs24001`    |
| Nama                      | String tanpa spasi, contoh: `Alice`       |
| Nilai                     | Bilangan bulat, 0 ≤ Nilai ≤ 100           |
| Algoritma                 | Wajib menggunakan **Merge Sort**          |
| File yang diubah          | Hanya **Program.java**                    |

---

## Format Input

```
n
NIM_1
Nama_1
Nilai_1
NIM_2
Nama_2
Nilai_2
...
NIM_n
Nama_n
Nilai_n
```

Keterangan:
- Baris pertama berisi **n** yaitu jumlah mahasiswa
- Setiap mahasiswa diwakili oleh **3 baris berurutan**: NIM, Nama, lalu Nilai
- Tidak ada baris kosong antar data mahasiswa

---

## Format Output

```
NIM_1|Nama_1|Nilai_1
NIM_2|Nama_2|Nilai_2
...
```

Keterangan:
- Setiap baris mewakili satu mahasiswa dengan format `NIM|Nama|Nilai`
- Pemisah antar atribut menggunakan karakter **pipe** `|`
- Data sudah terurut sesuai aturan pengurutan di atas
- Tidak ada spasi sebelum atau sesudah karakter `|`

---

## Contoh

**Input:**
```
3
ifs24001
Alice
85
ifs24002
Bob
90
ifs24003
Charlie
85
```

**Output:**
```
ifs24002|Bob|90
ifs24001|Alice|85
ifs24003|Charlie|85
```

**Penjelasan langkah per langkah:**

1. Program membaca 3 data mahasiswa:
   - `ifs24001` | Alice     | 85
   - `ifs24002` | Bob       | 90
   - `ifs24003` | Charlie   | 85

2. Diurutkan berdasarkan Nilai secara descending:
   - Bob (90) → urutan pertama karena nilai tertinggi
   - Alice (85) dan Charlie (85) → nilai sama, lanjut ke aturan sekunder

3. Alice dan Charlie memiliki nilai sama (85), maka diurutkan berdasarkan NIM secara ascending:
   - `ifs24001` (Alice) → lebih kecil, jadi duluan
   - `ifs24003` (Charlie) → lebih besar, jadi belakangan

4. Hasil akhir:
```
   ifs24002|Bob|90
   ifs24001|Alice|85
   ifs24003|Charlie|85
```

---

## Source Codes

| No    | File              | Status            | Deskripsi                                         |
|-------|-------------------|-------------------|---------------------------------------------------|
| 1     | `App.java`        | Jangan diubah     | Menangani input dari user dan menampilkan output  |
| 2     | `Student.java`    | Jangan diubah     | Representasi objek data mahasiswa                 |
| 3     | `Program.java`    | **Wajib diisi**   | Tempat kamu mengimplementasikan Merge Sort        |

> ⚠️ hanya perlu mengubah file `Program.java`. Jangan mengubah file lainnya karena dapat menyebabkan test case gagal.

---

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

---

## Compile

```bash
mvn clean package
```

## Run

```bash
java -cp target/app.jar del.alstrudat.App
```