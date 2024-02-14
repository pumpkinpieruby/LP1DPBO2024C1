<?php
class DPR
{
    private $id;
    private $name;
    private $namaBidang;
    private $partai;
    private $photo;

    function __construct($id = 0, $name = "", $namaBidang = "", $partai = "", $photo = "") {
        $this->id = $id;
        $this->name = $name;
        $this->namaBidang = $namaBidang;
        $this->partai = $partai;
        $this->photo = $photo; // Inisialisasi properti foto
    }

    function get_Id() {
        return $this->id;
    }

    function set_Id($id) {
        $this->id = $id;
    }

    function get_Name() {
        return $this->name;
    }

    function set_Name($name) {
        $this->name = $name;
    }

    function get_namaBidang() {
        return $this->namaBidang;
    }

    function set_namaBidang($namaBidang) {
        $this->namaBidang = $namaBidang;
    }

    function get_Partai() {
        return $this->partai;
    }

    function set_Partai($partai) {
        $this->partai = $partai;
    }

    // Metode untuk mendapatkan lokasi foto
    function get_Photo() {
        return $this->photo;
    }

    // Metode untuk mengatur lokasi foto
    function set_Photo($photo) {
        $this->photo = $photo;
    }

}
?>